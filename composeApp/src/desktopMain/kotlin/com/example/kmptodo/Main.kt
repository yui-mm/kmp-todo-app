package com.example.kmptodo

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import androidx.compose.ui.unit.dp

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP TODO App",
        state = rememberWindowState(width = 400.dp, height = 700.dp)
    ) {
        App()
    }
}
