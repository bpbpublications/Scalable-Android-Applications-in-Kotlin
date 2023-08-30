package com.example.chapter8

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun LoginUi(
    state: LoginUiState,
    event: (LoginEvents) -> Unit
) {
    // ...
    Button(
        onClick = { event(LoginEvents.OnLoginClicked("name", "pwd")) }
    ) { Text(text = "Login") }
    // ...
    Text(text = state.errorMsg)
}