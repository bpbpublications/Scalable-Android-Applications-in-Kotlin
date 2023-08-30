package com.example.chapter8

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun createFlow(): Flow<Int> = flow {
    for (i in 1..5) {
        delay(100)
        emit(i)
    }
}

// Collect and print the emitted values
fun main() = runBlocking {
    createFlow().collect { value ->
        println(value)
    }
}
