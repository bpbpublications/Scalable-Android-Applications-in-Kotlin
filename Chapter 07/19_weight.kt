package com.example.chapter7

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WeightExample3() {
    Row {
        ExtractedText(
            text = "Item A",
            modifier = Modifier.weight(0.3f)
        )
        ExtractedText(
            text = "Item B",
            modifier = Modifier.weight(0.3f)
        )
        ExtractedText(
            text = "Item C",
            modifier = Modifier.weight(0.3f)
        )
    }
}

@Composable
private fun ExtractedText(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier.padding(start = 10.dp),
        text = text
    )
}