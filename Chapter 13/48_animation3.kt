import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.Left
import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.Right

NavHost(
    navController = navController,
    startDestination = homescreen,
    enterTransition = {
        if (targetState.destination.route == detailScreen.route)
            slideIntoContainer(Left)
        else EnterTransition.None
    },
    popEnterTransition = { EnterTransition.None },
    exitTransition = { ExitTransition.None },
    popExitTransition = {
        if (targetState.destination.route == homescreen.route)
            slideOutOfContainer(Right)
        else ExitTransition.None
}
) {
    // populated by composable and navigation calls
}
