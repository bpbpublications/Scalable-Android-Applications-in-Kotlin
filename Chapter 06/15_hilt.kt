package com.aimicor.example.myapplication

import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserActivity2 : AppCompatActivity() {
    private val viewModel: UserViewModel by viewModels()
    // ...
}
