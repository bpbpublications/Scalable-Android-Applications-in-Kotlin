package com.example.chapter8

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class UserProfileActivity2 : AppCompatActivity() {
    private val viewModel: UserProfileViewModel by viewModels()
    private val username: TextView by lazy { findViewById(R.id.username) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user)

        viewModel.user.observe(this) { user -> username.text = user.name }
        viewModel.loadUserData()
    }
}
