package com.example.chapter9

import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.time.ExperimentalTime

@ExperimentalTime
@ExperimentalCoroutinesApi
class SynchronousTest {

    @Test
    fun `test synchronous flow emission without Turbine`() = runTest {
        val flow = flow {
            emit(1)
            delay(100)
            emit(2)
        }

        val collectedValues = mutableListOf<Int>()
        launch {
            flow.collect { value ->
                collectedValues.add(value)
            }
        }

        advanceTimeBy(1)
        assertEquals(listOf(1), collectedValues)
        advanceTimeBy(101)
        assertEquals(listOf(1, 2), collectedValues)
    }
}
