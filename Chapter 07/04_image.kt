package com.example.chapter7

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun ImageExample() {
    Image(
        painter = painterResource(
            id = R.drawable.ic_launcher_background
        ),
        contentDescription = "Sample Image",
    )
}
