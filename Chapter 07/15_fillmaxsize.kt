package com.example.chapter7

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BoxExample2() {
    Box(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize()
    ) { /* composable content */ }
}