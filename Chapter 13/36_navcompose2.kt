@Composable
internal fun ScreenA(
    gotoB: (User?) -> Unit
) {
    // ...
    gotoB(User("user123"))
}

@Composable
internal fun ScreenB(user: User?) { /* ... */ }
