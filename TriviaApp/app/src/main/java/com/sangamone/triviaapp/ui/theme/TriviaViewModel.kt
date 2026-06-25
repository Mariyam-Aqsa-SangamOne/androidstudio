package com.sangamone.triviaapp.ui.theme

import com.sangamone.triviaapp.data.TriviaPath
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.*
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TriviaViewModel : ViewModel() {

    val trivia = TriviaPath()
    val _uistate = MutableStateFlow(UIstate())
    val uistate = _uistate.asStateFlow()
    fun triviaList(){
        viewModelScope.launch{
            _uistate.value = _uistate.value.copy(
                isLoading =  true,
                errorMsg=null
            )
            try{
            val response = trivia.triviaFacts(
                amount= 10,
                category=18,
                type = "boolean"
            )
            _uistate.value = _uistate.value.copy(
                isLoading = false,
                projects = response.results
            )
            } catch(e:Exception){
            _uistate.value = _uistate.value.copy(
                isLoading = false,
                errorMsg = e.message
            )
            }
        }
    }
}