package com.aimicor.example.myapplication

import UserRepository
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class UserActivity1 : AppCompatActivity() {
    @Inject
    lateinit var userRepository: UserRepository

    // ...
}
