val isVisible = remember { mutableStateOf(false) }

AnimatedVisibility(
    visible = isVisible,
    enter = fadeIn() + expandVertically(),
    exit = fadeOut() + shrinkVertically()
) {
    Text("This content will appear and disappear with animation.")
}

Button(onClick = { isVisible.value = !isVisible.value }) {
    Text("Toggle Visibility")
}
