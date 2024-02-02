package com.example.cityexplorerapp.ui

import androidx.lifecycle.ViewModel
import com.example.cityexplorerapp.model.ExplorerUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ExplorerViewModel : ViewModel() {
    private val _expandedState = MutableStateFlow(ExplorerUiState())
    val expandedState: StateFlow<ExplorerUiState> = _expandedState.asStateFlow()



}