package com.sangamone.triviaapp.model

data class Trivia (
    val question : String,
    val correct_answer: String,
    val incorrect_answers : List<String>
)
