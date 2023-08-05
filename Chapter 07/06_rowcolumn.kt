package com.example.chapter7

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RowColumnExample() {
    Column {
        Row {
            Text("Item A")
            Text("Item B")
            Text("Item C")
        }
        Row {
            Text("Item A")
            Text("Item B")
            Text("Item C")
        }
    }
}