override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
        val navController = rememberNavController()
        val gotoB = { navController.navigate(ScreenKeys.screenB) }

        NavHost(
            navController,
            startDestination = ScreenKeys.screenA
        ) {
            composable(ScreenKeys.screenA) { ScreenA(gotoB) }
            composable(ScreenKeys.screenB) { ScreenB() }
        }
    }
}
