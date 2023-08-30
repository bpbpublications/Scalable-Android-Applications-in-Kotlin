package com.example.chapter8

data class LoginUiState(
    val loadState: LoginLoadState,
    val errorMsg: String,
    val showPassword: Boolean
): UiState

enum class LoginLoadState { IDLE, LOADING, FAILED }