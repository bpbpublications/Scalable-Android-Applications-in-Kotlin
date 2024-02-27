@Composable
fun ScreenA(
    gotoB: () -> Unit
) {
    // ...
    gotoB()
}

@Composable
fun ScreenB() { /* ... */ }
