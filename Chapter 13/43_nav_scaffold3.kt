NavHost( // outer NavHost
    fullScreenNavController,
    startDestination = scaffoldComposable
) {
    composable(fullscreen1) { Fullscreen1(navViewModel::handleEvent) }
    composable(fullscreen2) { Fullscreen2(navViewModel::handleEvent) }
    composable(fullscreen3) { Fullscreen3(navViewModel::handleEvent) }
    composable(scaffoldComposable) {
        Scaffolder(state, navViewModel::handleEvent) {
            NavHost( // inner NavHost
                scaffoldNavController,
                startDestination = screenInScaffold1
            ) {
                composable(screenInScaffold1) { ScreenInScaffold1() }
                composable(screenInScaffold2) { ScreenInScaffold2() }
                composable(screenInScaffold3) { ScreenInScaffold3() }
            }
        }
    }
}
