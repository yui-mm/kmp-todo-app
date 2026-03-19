package com.example.kmptodo

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class TodoViewModel : ViewModel() {

    private val _todos = MutableStateFlow<List<TodoItem>>(emptyList())
    val todos: StateFlow<List<TodoItem>> = _todos.asStateFlow()

    private var nextId = 1L

    fun addTodo(title: String) {
        if (title.isBlank()) return
        _todos.update { currentList ->
            currentList + TodoItem(id = nextId++, title = title.trim())
        }
    }

    fun toggleTodo(id: Long) {
        _todos.update { currentList ->
            currentList.map { item ->
                if (item.id == id) item.copy(isCompleted = !item.isCompleted) else item
            }
        }
    }

    fun deleteTodo(id: Long) {
        _todos.update { currentList ->
            currentList.filter { it.id != id }
        }
    }
}
