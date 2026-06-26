package com.sangamone.jokesgenerator.ui.theme


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sangamone.jokesgenerator.data.JokePath
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class JokeViewModel : ViewModel() {

    private val repository = JokePath()

    private val _uistate = MutableStateFlow(UIstate())
    val uistate = _uistate.asStateFlow()

    fun getJoke() {

        viewModelScope.launch {

            _uistate.value = _uistate.value.copy(
                isLoading = true,
                errorMsg = null
            )

            try {

                val response = repository.joke()

                _uistate.value = _uistate.value.copy(
                    isLoading = false,
                    joke = response
                )

            } catch (e: Exception) {

                _uistate.value = _uistate.value.copy(
                    isLoading = false,
                    errorMsg = e.message
                )

            }

        }

    }

}