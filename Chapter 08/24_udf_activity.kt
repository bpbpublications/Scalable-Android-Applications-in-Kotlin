package com.example.chapter8

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.repeatOnLifecycle

class LoginActivity3 : ComponentActivity() {
    private val loginViewModel by viewModels<LoginUdfViewModel2>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val state by loginViewModel.uiState.collectAsStateWithLifecycle()
            LoginUi(state = state, event = loginViewModel::handleEvent)

            val lifecycle = LocalLifecycleOwner.current
            LaunchedEffect(true) {
                lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                    loginViewModel.sideEffect.collect { handleSideEffect(it) }
                }
            }
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
