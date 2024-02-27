setContent {
    val navController = rememberNavController()
    val gotoB: (User?) -> Unit = { user ->
        navController.navigate(
            composable = ScreenKeys.screenB,
            ParamKeys.screenB with user
        )
    }

    NavHost(
        navController,
        startDestination = ScreenKeys.screenA
    ) {
        composable(ScreenKeys.screenA) { ScreenA(gotoB) }
        composable(ScreenKeys.screenB) { backStackEntry ->
            ScreenB(backStackEntry.getNavParamOrNull(ParamKeys.screenB))
        }
    }
}
