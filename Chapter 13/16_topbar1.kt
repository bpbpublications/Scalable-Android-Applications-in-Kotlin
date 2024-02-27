@Composable
fun TopBar(
    state: ScaffoldState,
    event: (ScaffoldEvent) -> Unit,
    drawerState: DrawerState
) {
    TopAppBar(
        title = { Text(state.topBarTitle) },
        navigationIcon = { OpenDrawer(drawerState) },
        actions = { TopBarDropdown(event) }
    )
}
