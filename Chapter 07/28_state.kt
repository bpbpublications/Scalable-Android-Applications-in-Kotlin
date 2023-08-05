package com.example.chapter7

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable

@Composable
fun BackHandlerExample() {
    BackHandler {
        // do some checks on back pressed
    }
}
