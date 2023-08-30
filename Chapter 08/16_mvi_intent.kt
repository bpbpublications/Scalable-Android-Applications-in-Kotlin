package com.example.chapter8

sealed class LoginEvents: Event {
    object OnHelpClicked : LoginEvents()
    object OnShowPwdClicked : LoginEvents()
    object OnClose : LoginEvents()
    data class OnLoginClicked(
        val name: String, val pwd: String
    ) : LoginEvents()
}
