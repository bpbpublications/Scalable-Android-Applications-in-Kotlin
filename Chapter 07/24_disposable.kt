package com.example.chapter7

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect

@Composable
fun DisposableEffectExample() {
    DisposableEffect(Unit) {
        // Perform side effect when the
        // composable is first composed
        println("Composable created")

        onDispose {
            // Perform cleanup when the
            // composable is no longer needed
            println("Composable disposed")
        }
    }
}
