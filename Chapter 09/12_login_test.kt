package com.example.chapter9

import app.cash.turbine.test
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class LoginUdfViewModelTest {

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    private val sut by lazy { LoginUdfViewModel() }

    @Test
    fun `GIVEN sut WHEN back key event THEN close side effect`() =
        runTest {
            // Given
            sut.sideEffect.test {
                expectNoEvents()

                // When
                sut.handleEvent(LoginEvent.OnClose)

                // Then
                assertEquals(LoginEffect.Close, awaitItem())
            }
        }
}
