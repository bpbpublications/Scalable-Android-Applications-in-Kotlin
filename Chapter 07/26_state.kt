package com.example.chapter7

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalCount = staticCompositionLocalOf<Int> {
    error("No count provided")
}

@Composable
fun CounterWithLocal() {
    val count = LocalCount.current

    Button(onClick = { /* Increment count */ }) {
        Text("Count: $count")
    }
}
