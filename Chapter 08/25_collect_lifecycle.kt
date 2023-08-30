package com.example.chapter8

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.flow.Flow

@Composable
fun <T> Flow<T>.collectWithLifecycle(
    key: Any? = true,
    lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current,
    state: Lifecycle.State = Lifecycle.State.STARTED,
    block: (T) -> Unit
) = LaunchedEffect(key) {
    lifecycleOwner.repeatOnLifecycle(state) {
        collect { block(it) }
    }
}