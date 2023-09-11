package com.example.chapter9

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class UserDetails(
    val name: String,
)

class UserDetailsUseCaseImpl(
    private val repo: UserDetailsRepository
) : UserDetailsUseCase {

    override suspend fun invoke(
        name: String, pwd: String
    ): Result<UserDetails> = repo.loginAndGetDetails(name, pwd)
}

interface Event
interface UiState
interface SideEffect

interface Udf<EV : Event, ST : UiState, EF : SideEffect> {
    val uiState: StateFlow<ST>
    val sideEffect: Flow<EF>
    fun handleEvent(event: EV)
}

abstract class UdfViewModel<EV : Event, ST : UiState, EF : SideEffect>(
    private val initialUiState: ST
) : Udf<EV, ST, EF>, ViewModel() {

    private val _uiState: MutableStateFlow<ST> by lazy {
        MutableStateFlow(initialUiState)
    }
    override val uiState: StateFlow<ST> by lazy { _uiState.asStateFlow() }

    private val _sideEffect: Channel<EF> = Channel()
    override val sideEffect: Flow<EF> by lazy { _sideEffect.receiveAsFlow() }

    abstract override fun handleEvent(event: EV)

    protected fun setUiState(reduce: ST.() -> ST) {
        _uiState.update { _uiState.value.reduce() }
    }

    protected fun sendSideEffect(builder: () -> EF) {
        viewModelScope.launch {
            _sideEffect.send(builder())
        }
    }
}
