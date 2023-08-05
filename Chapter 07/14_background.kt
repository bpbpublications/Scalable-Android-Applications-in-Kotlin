package com.example.chapter7

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BoxExample1() {
    Box(
        modifier = Modifier.background(Color.Gray)
    ) {
        Text("Hello")
        Text("World")
    }
}