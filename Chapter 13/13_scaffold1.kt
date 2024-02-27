@Composable
fun Scaffolder(
    content: @Composable () -> Unit
) {
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopBar() },
        bottomBar = { BottomBar() },
        drawerContent = { DrawerContent() },
        floatingActionButton = {
            val coScope: CoroutineScope = rememberCoroutineScope()
            Fab { coScope.showSnackBar(scaffoldState.snackbarHostState) }
        },
        snackbarHost = { SnackHost(scaffoldState.snackbarHostState) }
    ) { scaffoldPadding ->
        Box(modifier = Modifier.padding(scaffoldPadding)) { content() }
    }
}
