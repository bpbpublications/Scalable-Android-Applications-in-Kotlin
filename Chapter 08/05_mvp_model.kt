package com.example.chapter8

class UserModel {
    fun login(
        user: String, pwd: String,
        callback: (Result<Int>) -> Unit
    ) { /* Perform login logic, call callback with result */ }
}
