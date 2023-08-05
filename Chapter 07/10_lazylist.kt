package com.example.chapter7

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun LazyListExample() {
    val itemsList = listOf("a", "b", "c")

    LazyColumn {
        items(itemsList) { item -> Text(item) }
    }
}