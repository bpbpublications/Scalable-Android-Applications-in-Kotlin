class LoginRobot(
    private val rule: ComposeTestRule,
) {
    private var lastEvent: LoginEvent? = null
    fun handleEvent(event: LoginEvent) {
        lastEvent = event
    }

    fun enterUsername(username: String): LoginRobot {
        rule.onNode(hasText("Username"))
            .performTextInput(username)
        return this
    }

    fun enterPassword(password: String): LoginRobot {
        rule.onNode(hasText("Enter password"))
            .performTextInput(password)
        return this
    }

    fun clickLoginButton(): LoginRobot {
        rule.onNodeWithText("Login").performClick()
        return this
    }

    fun assertCredentialsSent(testUser: String, testPass: String) {
        (lastEvent!! as LoginEvent.OnLoginTapped).apply {
            assertEquals(testUser, username)
            assertEquals(testPass, password)
        }
    }
}
