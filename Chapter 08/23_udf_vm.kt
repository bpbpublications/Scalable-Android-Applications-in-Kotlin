package com.example.chapter8

import com.example.chapter8.LoginLoadState.IDLE

class LoginUdfViewModel2
    : UdfViewModel2<LoginEvents, LoginUiState, LoginSideEffect>(
    initialUiState = LoginUiState(
        loadState = IDLE,
        errorMsg = "",
        showPassword = false
    )
) {
    override fun handleEvent(event: LoginEvents) {
        when (event) {
            LoginEvents.OnHelpClicked -> TODO()
            is LoginEvents.OnLoginClicked -> TODO()
            LoginEvents.OnShowPwdClicked -> TODO()
            LoginEvents.OnClose -> sendSideEffect { LoginSideEffect.Close }
        }
    }

    private fun gotoHome() {
        sendSideEffect { LoginSideEffect.GotoHome }
    }
}