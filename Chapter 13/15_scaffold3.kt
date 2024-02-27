val scaffoldState by scaffoldViewModel.uiState.collectAsStateWithLifecycle()
// ...
Scaffolder (
    state = scaffoldState,
    event = scaffoldViewModel::handleEvent
) {
    // screen content details here
}
