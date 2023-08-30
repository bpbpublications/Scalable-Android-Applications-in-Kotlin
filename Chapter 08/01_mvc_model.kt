package com.example.chapter8

data class User(val id: Int, val name: String, val email: String)

class UserRepository {
    fun getUsers(): List<User> =
        listOf() // Simulate fetching users from a remote API
}