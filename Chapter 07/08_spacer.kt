package com.example.chapter7

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpacerExample() {
    Column {
        Text("Item 1")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Item 2")
    }
}