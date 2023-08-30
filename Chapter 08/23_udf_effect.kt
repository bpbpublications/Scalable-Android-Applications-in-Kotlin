package com.example.chapter8

sealed class LoginSideEffect: SideEffect {
    object Close : LoginSideEffect()
    object GotoHome: LoginSideEffect()
    data class GotoHelp(val search: String) : LoginSideEffect()
}