package com.example.chapter8

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle

class LoginActivity4 : ComponentActivity() {
    private val loginViewModel by viewModels<LoginUdfViewModel2>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val state by loginViewModel.uiState
                .collectAsStateWithLifecycle()
            LoginUi(state = state, event = loginViewModel::handleEvent)

            BackHandler {
                loginViewModel.handleEvent(LoginEvents.OnClose)
            }

            loginViewModel.sideEffect
                .collectWithLifecycle { handleSideEffect(it) }
        }
    }

    private fun handleSideEffect(sideEffect: LoginSideEffect) {
        when (sideEffect) {
            LoginSideEffect.Close -> finish()
            is LoginSideEffect.GotoHelp -> startActivity(Intent(/* .. */))
            LoginSideEffect.GotoHome -> startActivity(Intent(/* .. */))
        }
    }
}
