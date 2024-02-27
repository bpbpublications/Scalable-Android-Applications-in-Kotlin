@Composable
fun SnackHost(state: SnackbarHostState) {
    SnackbarHost(state) { data ->
        Snackbar(
            shape = MaterialTheme.shapes.medium,
            backgroundColor = MaterialTheme.colors.primary,
            snackbarData = data
        )
    }
}
