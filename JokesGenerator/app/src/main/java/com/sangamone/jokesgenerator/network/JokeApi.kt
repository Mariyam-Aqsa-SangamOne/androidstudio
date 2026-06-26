package com.sangamone.jokesgenerator.network

import com.sangamone.jokesgenerator.model.JokeResponse
import retrofit2.http.GET
import com.sangamone.jokesgenerator.model.Joke
import retrofit2.http.Headers

interface JokeApi {

    @Headers("Accept: application/json")
    @GET("/")
    suspend fun getJoke(): Joke

}