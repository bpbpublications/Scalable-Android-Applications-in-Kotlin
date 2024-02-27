@Composable
fun OpenDrawer(drawerState: DrawerState) {
    val coroutineScope: CoroutineScope = rememberCoroutineScope()
    IconButton(
        onClick = {
            coroutineScope.launch { drawerState.open() }
        }
    ) { Icon(Icons.Filled.Menu, contentDescription = null) }
}
