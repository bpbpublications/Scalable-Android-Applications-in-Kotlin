MyApplicationTheme {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column {
            Greeting("Android")
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Click me")
            }
        }
    }
}
