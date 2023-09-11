package com.example.chapter9

interface UserDetailsRepository {
    suspend fun loginAndGetDetails(
        user: String, pwd: String
    ): Result<UserDetails>
}