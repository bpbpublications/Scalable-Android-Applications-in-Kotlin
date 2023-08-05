package com.example.chapter7

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WeightExample() {
    Row {
        Text(
            modifier = Modifier.weight(0.3f),
            text = "Item A"
        )
        Text(
            modifier = Modifier.weight(0.3f),
            text = "Item B"
        )
        Text(
            modifier = Modifier.weight(0.3f),
            text = "Item C"
        )
    }
}