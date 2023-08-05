package com.example.chapter7

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ButtonExample() {
    Button(
        onClick = {
            // Action to perform when the button is clicked
        }
    ) {
        Text("Click me")
    }
}