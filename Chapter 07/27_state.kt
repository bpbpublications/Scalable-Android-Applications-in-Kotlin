package com.example.chapter7

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.flowWithLifecycle
import kotlinx.coroutines.flow.MutableStateFlow

@Composable
fun FlowWithLifecycleExample() {
    val currentLifecycle = LocalLifecycleOwner.current.lifecycle
    val initialCount = 0
    val countFlow = MutableStateFlow(initialCount)

    val count by remember {
        countFlow.flowWithLifecycle(currentLifecycle)
    }.collectAsState(initial = initialCount)

    Button(onClick = { countFlow.value++ }) {
        Text("Count: $count")
    }
}