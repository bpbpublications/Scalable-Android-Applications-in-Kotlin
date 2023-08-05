package com.example.chapter7

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import kotlinx.coroutines.flow.MutableStateFlow

@Composable
fun FlowExample() {
    val countFlow = MutableStateFlow(0)
    val count by countFlow.collectAsState()

    Button(onClick = { countFlow.value++ }) {
        Text("Count: $count")
    }
}
