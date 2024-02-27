fun AnimatedBox() {
    // Define an Animatable for the size property
    val size = remember { Animatable(initialValue = 100f) }

    // Define an AnimationSpec for the animation
    val animationSpec: AnimationSpec<Float> = tween(
        durationMillis = 1000, // Animation duration
        easing = LinearEasing // Animation easing
    )

    // Trigger the animation
    LaunchedEffect(true) {
        size.animateTo(
            targetValue = 200f, // Target size
            animationSpec = animationSpec
        )
    }

    // Composable that animates the size of the box
    Box(
        modifier = Modifier
            .size(size.value.dp) // Size is animated
            .background(Color.Blue)
    )
}
