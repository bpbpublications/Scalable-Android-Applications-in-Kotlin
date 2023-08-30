package com.example.chapter8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class UserProfileActivity : AppCompatActivity() {
    private lateinit var viewModel: UserProfileViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ...
        viewModel = ViewModelProvider(this).get(
            UserProfileViewModel::class.java
        )
        // ...
    }
}
