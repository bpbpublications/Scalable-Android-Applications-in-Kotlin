class LoginContentTest {

    @Rule
    @JvmField
    val composeTestRule = createComposeRule()

    private val username = "test_user"
    private val password = "test_password"

    @Test
    fun `GIVEN credentials WHEN login THEN credentials sent`() = login(
        rule = composeTestRule,
        state = LoginState(isLoginFailed = false)
    ) {
        enterUsername(username)
        enterPassword(password)
        clickLoginButton()
        assertCredentialsSent(username, password)
    }
}
