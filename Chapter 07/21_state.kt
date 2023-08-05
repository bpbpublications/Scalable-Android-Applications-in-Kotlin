package com.example.chapter7

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun Counter1() {
    val count = remember { mutableStateOf(0) }

    Button(onClick = { count.value++ }) {
        Text("Count: $count")
    }
}
