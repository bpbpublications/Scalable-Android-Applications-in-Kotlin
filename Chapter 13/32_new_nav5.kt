NavHost(
    navController,
    startDestination = ScreenKeys.group
) {
    navigation(
        startDestination = ScreenKeys.screenA,
        route = ScreenKeys.group
    ) {
        composable(ScreenKeys.screenA) { ScreenA(gotoB) }
        composable(ScreenKeys.screenB) { ScreenB() }
    }
}
