package com.example.chapter8

import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.fragment.app.Fragment

class LoginActivity5 : ComponentActivity() {
    private val loginViewModel by LoginUdf(this)
    // ...
}

class LoginFragment1: Fragment() {
    private val loginViewModel by LoginUdf(this)
    // ...
}

@Composable
fun LoginScreen1(
    loginViewModel: LoginUdf = LoginUdf(),
) { /* ... */ }