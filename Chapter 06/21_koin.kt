package com.aimicor.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserActivity : AppCompatActivity() {

    private val viewModel by viewModel<UserViewModel>()

    // ...
}
