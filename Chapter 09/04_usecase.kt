package com.example.chapter9

interface UserDetailsUseCase {
    suspend operator fun invoke(
        name: String, pwd: String
    ): Result<UserDetails>
}