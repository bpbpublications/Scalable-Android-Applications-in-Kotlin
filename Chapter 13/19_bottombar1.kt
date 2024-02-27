@Composable
internal fun BottomBar(
    state: ScaffoldState,
    event: (ScaffoldEvent) -> Unit
) {
    BottomAppBar(
        content = {
            BottomNavigation {
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Home, null) },
                    label = { Text("Home") },
                    selected = state.barSelect == BarSelect.Home,
                    onClick = { event(ScaffoldEvent.HomeClicked) }
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Favorite, null) },
                    label = { Text("Favorites") },
                    selected = state.barSelect == BarSelect.Fav,
                    onClick = { event(ScaffoldEvent.FavClicked) }
                )
            }
        }
    )
}
