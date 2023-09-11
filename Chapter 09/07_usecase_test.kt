package com.example.chapter9

import io.mockk.coEvery
import io.mockk.mockk
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class UserDetailsUseCaseImplTest2 {
    private val repoMock = mockk<UserDetailsRepository>()
    private val sut by lazy { UserDetailsUseCaseImpl(repoMock) }

    @Test
    fun `GIVEN repo fail WHEN login THEN fail returned`() = runTest {
        // Given
        val fail = Result.failure<UserDetails>(Throwable())
        coEvery { repoMock.loginAndGetDetails(any(), any()) } returns fail

        // When
        val result = sut("", "")

        // Then
        assertEquals(fail, result)
    }
}