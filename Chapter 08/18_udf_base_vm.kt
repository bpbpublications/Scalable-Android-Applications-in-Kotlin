package com.example.chapter8

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

interface UiState
interface Event

abstract class UdfViewModel1<EV : Event, ST : UiState>(
    private val initialUiState: ST
) : ViewModel() {

    private val _uiState: MutableStateFlow<ST> by lazy {
        MutableStateFlow(initialUiState)
    }
    val uiState: StateFlow<ST> by lazy { _uiState.asStateFlow() }

    abstract fun handleEvent(event: EV)

    protected fun setUiState(reduce: ST.() -> ST) {
        _uiState.update { _uiState.value.reduce() }
    }
}
