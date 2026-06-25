package com.sangamone.triviaapp.network
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    val mockAPI: MockApi by lazy{
        Retrofit.Builder().baseUrl("https://opentdb.com/")
            .addConverterFactory(
                GsonConverterFactory.create()).build().create(MockApi::class.java)
    }
}