sealed class LoginEvent : Event {
    data class OnLoginTapped(
        val username: String,
        val password: String
    ) : LoginEvent()
}

data class LoginState(
    val isLoginFailed: Boolean
): UiState
