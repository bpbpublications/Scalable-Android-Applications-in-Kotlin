package com.aimicor.example.myapplication

import UserRepository
import UserService1
import org.koin.java.KoinJavaComponent.get
import org.koin.java.KoinJavaComponent.inject

class MyClass {
    private val userRepository: UserRepository = get(UserRepository::class.java)
    private val userService: UserService1 by inject(UserService1::class.java)

    // ...
}
