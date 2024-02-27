composable("screenB/{userId}") { backStackEntry ->
    ScreenB(backStackEntry.arguments?.getString("userId"))
}
