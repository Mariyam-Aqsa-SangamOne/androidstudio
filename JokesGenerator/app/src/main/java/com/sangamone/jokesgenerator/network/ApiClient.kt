package com.sangamone.jokesgenerator.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    val jokeAPI: JokeApi by lazy {

        Retrofit.Builder()
            .baseUrl("https://icanhazdadjoke.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(JokeApi::class.java)

    }

}