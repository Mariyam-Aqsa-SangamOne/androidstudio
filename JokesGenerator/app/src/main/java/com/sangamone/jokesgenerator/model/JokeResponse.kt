package com.sangamone.jokesgenerator.model


data class JokeResponse(
    val error: Boolean,
    val amount: Int,
    val jokes: List<Joke>
)