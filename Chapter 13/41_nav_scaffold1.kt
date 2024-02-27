@Composable
fun MainNav(
    // replace viewModel() with koinViewModel() or hiltViewModel()
    scaffoldViewModel: ScaffoldViewModel = viewModel()
) {
    val navController = rememberNavController()
    val scaffoldState by scaffoldViewModel
        .uiState.collectAsStateWithLifecycle()

    Scaffolder(
        state = scaffoldState,
        event = scaffoldViewModel::handleEvent
    ) {
        NavHost(
            navController,
            startDestination = ScreenKeys.screenA
        ) {
            composable(ScreenKeys.home) { HomeScreen() }
            composable(ScreenKeys.favorites) { FavoritesScreen() }
        }
    }

    scaffoldViewModel.sideEffect.collectWithLifecycle { effect ->
        // do navigation
    }
}
