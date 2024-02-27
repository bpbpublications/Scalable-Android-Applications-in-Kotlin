fun CoroutineScope.showSnackBar(
    snackState: SnackbarHostState,
    event: (ScaffoldEvent) -> Unit
) = launch {
    snackState.showSnackbar(
        message = "Snack Bar",
        actionLabel = "Navigate",
        duration = SnackbarDuration.Indefinite
    ).let { result ->
        when (result) {
            SnackbarResult.Dismissed -> event(ScaffoldEvent.SnackDismiss)
            SnackbarResult.ActionPerformed -> event(ScaffoldEvent.SnackGo)
        }
    }
}
