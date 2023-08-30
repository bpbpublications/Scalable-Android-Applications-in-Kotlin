package com.example.chapter8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle

class LoginActivity2 : ComponentActivity() {
    private val loginViewModel by viewModels<LoginUdfViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val state by loginViewModel.uiState.collectAsStateWithLifecycle()
            LoginUi(state = state, event = loginViewModel::handleEvent)
        }
    }
}