package com.example.chapter7

import androidx.compose.foundation.border
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonExample1() {
    Button(
        modifier = Modifier.border(2.dp, Color.Black),
        onClick = {
            // Action to perform when the button is clicked
        }
    ) {
        Text("Click me")
    }
}