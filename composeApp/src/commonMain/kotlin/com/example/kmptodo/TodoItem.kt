package com.example.kmptodo

data class TodoItem(
    val id: Long,
    val title: String,
    val isCompleted: Boolean = false
)
