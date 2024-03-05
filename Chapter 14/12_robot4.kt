fun login(
    rule: ComposeContentTestRule,
    state: LoginState,
    test: LoginRobot.() -> Unit
) {
    LoginRobot(rule).apply {
        rule.setContent { LoginContent(state, ::handleEvent) }
        rule.onRoot().printToLog("LoginContent") // optional
        test()
    }
}
