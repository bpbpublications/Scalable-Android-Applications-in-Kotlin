package com.example.chapter7

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import kotlinx.coroutines.flow.MutableStateFlow

@Composable
fun CollectAsStateWithLifecycleExample() {
    val initialCount = 0
    val countFlow = MutableStateFlow(initialCount)

    val count by countFlow.collectAsStateWithLifecycle()

    Button(onClick = { countFlow.value++ }) {
        Text("Count: $count")
    }
}