package com.example.chapter8

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

data class AppState(val counter: Int)

fun main() = runBlocking {
    val stateFlow = MutableStateFlow(AppState(counter = 0))

    val job = launch {
        stateFlow.collect { state ->
            println("Counter: ${state.counter}")
        }
    }

    delay(1000)
    stateFlow.value = AppState(counter = 1)
    delay(1000)
    stateFlow.value = AppState(counter = 2)

    job.cancel()
}