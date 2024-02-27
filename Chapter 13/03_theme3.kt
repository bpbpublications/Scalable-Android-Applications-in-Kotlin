class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var isDarkTheme by remember { mutableStateOf(false) }
            ExampleTheme(isDarkTheme) {
                Button(onClick = { isDarkTheme = !isDarkTheme }) {
                    Text(text = "Toggle Theme")
                }
            }
        }
    }
}
