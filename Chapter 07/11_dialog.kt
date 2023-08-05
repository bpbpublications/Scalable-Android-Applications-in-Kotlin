package com.example.chapter7

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Dialog

@Composable
fun DialogExample() {
    Dialog(
        onDismissRequest = {
            // Dialog dismiss logic
        }
    ) {
        // Dialog content
    }
}