package com.example.chapter7

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun LaunchedEffectExample() {
    var count by remember { mutableStateOf(0) }

    LaunchedEffect(count) {
        println("Count changed: $count")
    }

    // increment count
}
