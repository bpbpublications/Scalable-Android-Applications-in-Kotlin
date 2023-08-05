package com.example.chapter7

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun ImageExample1() {
    Image(
        modifier = Modifier.clickable {
            // on click logic
        },
        painter = painterResource(
            id = R.drawable.ic_launcher_background
        ),
        contentDescription = "Sample Image",
    )
}
