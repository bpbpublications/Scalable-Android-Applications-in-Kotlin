@Composable
internal fun TopBarDropdown(
    event: (ScaffoldEvent) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    Box {
        IconButton(
            onClick = { expanded = !expanded }
        ) { Icon(Icons.Default.Add, contentDescription = null) }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = !expanded }
        ) {
            DropdownMenuItem(
                onClick = { event(ScaffoldEvent.Item1Clicked) }
            ) { Text(text = "Item 1") }
            DropdownMenuItem(
                onClick = { event(ScaffoldEvent.Item2Clicked) }
            ) { Text(text = "Item 2") }
        }
    }
}
