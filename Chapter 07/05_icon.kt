package com.example.chapter7

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun IconExample() {
    Icon(
        imageVector = Icons.Default.Favorite,
        contentDescription = "Favorite Icon",
        tint = Color.Red
    )
}
