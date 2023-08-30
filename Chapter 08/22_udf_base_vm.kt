package com.example.chapter8

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

interface SideEffect

abstract class UdfViewModel2<EV : Event, ST : UiState, EF : SideEffect>(
    private val initialUiState: ST
) : ViewModel() {

    private val _uiState: MutableStateFlow<ST> by lazy {
        MutableStateFlow(initialUiState)
    }
    val uiState: StateFlow<ST> by lazy { _uiState.asStateFlow() }

    private val _sideEffect: Channel<EF> = Channel()
    val sideEffect: Flow<EF> by lazy { _sideEffect.receiveAsFlow() }

    abstract fun handleEvent(event: EV)

    protected fun setUiState(reduce: ST.() -> ST) {
        _uiState.update { _uiState.value.reduce() }
    }

    protected fun sendSideEffect(builder: () -> EF) {
        viewModelScope.launch {
            _sideEffect.send(builder())
        }
    }
}
