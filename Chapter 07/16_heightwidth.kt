package com.example.chapter7

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun IconExample1() {
    Icon(
        modifier = Modifier.height(100.dp).width(50.dp),
        imageVector = Icons.Default.Favorite,
        contentDescription = "Favorite Icon",
        tint = Color.Red
    )
}
