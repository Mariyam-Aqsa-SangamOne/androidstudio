package com.sangamone.jokesgenerator.data

import com.sangamone.jokesgenerator.network.ApiClient
import com.sangamone.jokesgenerator.model.JokeResponse

import com.sangamone.jokesgenerator.model.Joke

class JokePath {

    suspend fun joke(): Joke {
        return ApiClient.jokeAPI.getJoke()
    }

}