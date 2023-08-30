package com.example.chapter8

import com.example.chapter8.LoginLoadState.IDLE
import com.example.chapter8.LoginLoadState.LOADING

class LoginUdfViewModel : UdfViewModel1<LoginEvents, LoginUiState>(
    initialUiState = LoginUiState(
        loadState = IDLE,
        errorMsg = "",
        showPassword = false
    )
) {
    override fun handleEvent(event: LoginEvents) {
        when(event){
            LoginEvents.OnHelpClicked -> TODO()
            is LoginEvents.OnLoginClicked -> TODO()
            LoginEvents.OnShowPwdClicked -> TODO()
            LoginEvents.OnClose -> TODO()
        }
    }

    private fun setLoading() {
        setUiState { copy(loadState = LOADING) }
    }
}