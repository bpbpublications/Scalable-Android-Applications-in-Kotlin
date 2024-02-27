@Composable
internal fun DrawerContent(
    event: (ScaffoldEvent) -> Unit
) {
    Column {
        Button(
            onClick = { event(ScaffoldEvent.GoSomeWhere) }
        ) { Text("navigate") }
        // ...
    }
}
