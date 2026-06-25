package com.sangamone.triviaapp.ui.theme
import com.sangamone.triviaapp.model.Trivia

data class UIstate (
    val isLoading: Boolean = false,
    val projects: List<Trivia> = emptyList(),
    val response_code: Int = 0,
    val errorMsg: String? = ""
)
