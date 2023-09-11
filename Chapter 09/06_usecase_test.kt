package com.example.chapter9

import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class UserDetailsUseCaseImplTest {
    private lateinit var repoMock: UserDetailsRepository

    @Test
    fun `GIVEN repo fail WHEN login THEN fail returned`() = runTest {
        // Given
        val failure = Result.failure<UserDetails>(Throwable())
        repoMock = object : UserDetailsRepository {
            override suspend fun loginAndGetDetails(
                user: String, pwd: String
            ): Result<UserDetails> = failure
        }
        val sut = UserDetailsUseCaseImpl(repoMock)

        // When
        val result = sut("", "")

        // Then
        assertEquals(failure, result)
    }
}