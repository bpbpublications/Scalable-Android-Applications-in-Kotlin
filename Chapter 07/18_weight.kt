package com.example.chapter7

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WeightExample2() {
    Row {
        ExtractedText("Item A")
        ExtractedText("Item B")
        ExtractedText("Item C")
    }
}

@Composable
private fun RowScope.ExtractedText(text: String) {
    Text(
        modifier = Modifier.weight(0.3f),
        text = text
    )
}