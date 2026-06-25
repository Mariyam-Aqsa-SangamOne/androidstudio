package com.sangamone.triviaapp.data

import com.sangamone.triviaapp.model.Response
import com.sangamone.triviaapp.network.ApiClient

class TriviaPath {
    suspend fun triviaFacts(amount:Int, category:Int,type: String): Response{
        return ApiClient.mockAPI.trivia(amount,category,type)
    }
}