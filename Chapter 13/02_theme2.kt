@Composable
fun ExampleTheme(
    isDarkTheme: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme =
        if (isDarkTheme) DarkColorScheme
        else LightColorScheme,
        content = content
    )
}
