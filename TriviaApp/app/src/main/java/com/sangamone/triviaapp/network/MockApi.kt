package com.sangamone.triviaapp.network
import retrofit2.http.GET
import com.sangamone.triviaapp.model.Response
import retrofit2.http.Query

interface MockApi {
    @GET("Programming")
    suspend fun trivia(
        @Query("amount") amount : Int,
        @Query("category") category : Int,
        @Query("type") type : String,
    ):Response
}