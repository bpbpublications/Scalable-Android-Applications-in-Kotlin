package com.example.chapter7

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun DerivedCounter() {
    var count by remember { mutableStateOf(0) }
    val doubledCount = remember { derivedStateOf { count * 2 } }

    Button(onClick = { count++ }) {
        Text("Doubled Count: $doubledCount")
    }
}
