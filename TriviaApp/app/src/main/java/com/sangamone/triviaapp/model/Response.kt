package com.sangamone.triviaapp.model

data class Response (
    val response_code: Int,
    val results: List<Trivia>
)
