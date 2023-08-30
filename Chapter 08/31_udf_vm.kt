package com.example.chapter8

import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewmodel.compose.viewModel

interface LoginUdf : Udf<LoginEvents, LoginUiState, LoginSideEffect> {
    companion object {
        operator fun invoke(activity: ComponentActivity): Lazy<LoginUdf> =
            activity.viewModels<LoginUdfViewModel3>()

        operator fun invoke(fragment: Fragment): Lazy<LoginUdf> =
            fragment.viewModels<LoginUdfViewModel3>()

        @Composable
        operator fun invoke(): LoginUdf = viewModel<LoginUdfViewModel3>()
    }
}

class LoginUdfViewModel3
    : LoginUdf, UdfViewModel3<LoginEvents, LoginUiState, LoginSideEffect>(
    initialUiState = LoginUiState(
        loadState = LoginLoadState.IDLE,
        errorMsg = "",
        showPassword = false
    )
) {
    override fun handleEvent(event: LoginEvents) {
        // ...
    }
}