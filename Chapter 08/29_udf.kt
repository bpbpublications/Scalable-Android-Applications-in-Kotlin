package com.example.chapter8

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

interface Udf<EV : Event, ST : UiState, EF : SideEffect> {
    val uiState: StateFlow<ST>
    val sideEffect: Flow<EF>
    fun handleEvent(event: EV)
}