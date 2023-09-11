package com.example.chapter9


sealed class LoginEvent : Event {
    object OnClose : LoginEvent()
}

sealed class LoginEffect : SideEffect {
    object Close : LoginEffect()
}

class LoginUdfViewModel : UdfViewModel<LoginEvent, UiState, LoginEffect>(
    initialUiState = object : UiState {}
) {
    override fun handleEvent(event: LoginEvent) {
        sendSideEffect { LoginEffect.Close }
    }
}
