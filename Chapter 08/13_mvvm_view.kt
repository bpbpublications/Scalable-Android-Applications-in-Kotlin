package com.example.chapter8

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.chapter8.databinding.UserBinding

class UserProfileActivity3 : AppCompatActivity() {
    private val viewModel: UserProfileViewModel by viewModels()
    private val binding: UserBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.user)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.user.observe(this) { binding.user = it }
        viewModel.loadUserData()
    }
}
