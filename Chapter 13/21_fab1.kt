@Composable
internal fun Fab(
    onClick: () -> Unit,
) = FloatingActionButton(onClick) {
    Icon(Icons.Default.Add, null)
}
