composable(
    "screenB?userId={userId}",
    arguments = listOf(navArgument("userId") { defaultValue = "user123" })
) { backStackEntry ->
    ScreenB(backStackEntry.arguments?.getString("userId"))
}
