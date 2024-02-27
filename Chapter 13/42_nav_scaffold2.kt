@Composable
internal fun Scaffolder(
    state: ScaffoldUiState,
    event: (ScaffoldEvent) -> Unit,
    content: @Composable () -> Unit
) {
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    Scaffold(
        // ...
        bottomBar = {
            if (state.isBottomBarVisible) { BottomBar(state, event) }
        },
        // ...
    )
}
