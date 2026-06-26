package com.sangamone.jokesgenerator.ui.theme


import com.sangamone.jokesgenerator.model.Joke

data class UIstate(

    val isLoading: Boolean = false,
    val joke: Joke? = null,
    val errorMsg: String? = null

)