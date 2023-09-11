package com.example.chapter9

import app.cash.turbine.test
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.time.ExperimentalTime

@ExperimentalTime
@ExperimentalCoroutinesApi
class SomeTest {

    @Test
    fun `test synchronous flow emission with Turbine`() = runTest {
        val flow = flow {
            emit(1)
            delay(100)
            emit(2)
        }

        flow.test {
            assertEquals(1, expectMostRecentItem())
            advanceTimeBy(101)
            assertEquals(2, expectMostRecentItem())
            awaitComplete()
            expectNoEvents()
        }
    }
}
