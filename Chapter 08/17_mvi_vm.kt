package com.example.chapter8

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class LoginMviViewModelProto: ViewModel() {

    val model = MutableStateFlow(
        LoginUiState(
            loadState = LoginLoadState.IDLE,
            errorMsg = "",
            showPassword = false
        )
    )

    fun intent(intent: LoginEvents) {
        when(intent){
            LoginEvents.OnHelpClicked -> TODO()
            is LoginEvents.OnLoginClicked -> TODO()
            LoginEvents.OnShowPwdClicked -> TODO()
            LoginEvents.OnClose -> TODO()
        }
    }
}