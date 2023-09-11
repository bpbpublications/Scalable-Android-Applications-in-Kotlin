package com.example.chapter9

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.test.runTest

suspend fun performAsyncOperation(): Int {
    delay(100000)
    return 42
}

@ExperimentalCoroutinesApi
fun main() = runTest {
    val deferredResult = async { performAsyncOperation() }
    val result = deferredResult.await()
    assert(result == 42)
}