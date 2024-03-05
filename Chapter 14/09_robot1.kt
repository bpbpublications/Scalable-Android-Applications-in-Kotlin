@Composable
fun LoginContent(
    state: LoginState,
    event: (LoginEvent) -> Unit,
) {
    Column {
        var username: String by rememberSaveable { mutableStateOf("") }
        var password by rememberSaveable { mutableStateOf("") }

        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") }
        )
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Enter password") },
        )
        Button(
            onClick = {
                event(LoginEvent.OnLoginTapped(username, password))
            }
        ) { Text("Login") }
        if (state.isLoginFailed) Text(text = "Login Failed")
    }
}
