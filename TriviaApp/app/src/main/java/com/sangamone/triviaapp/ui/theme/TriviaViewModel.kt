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
    fun triviaList(searchText: String){
        if(searchText.isBlank()) {
            _uistate.value = UIstate(errorMsg = "Please enter a search text")
            return
        }
        viewModelScope.launch{
            _uistate.value = _uistate.value.copy(isLoading =  true, errorMsg="")
            val response = trivia.triviaFacts(amount= 10, category=18,type = searchText)
            _uistate.value = _uistate.value.copy(isLoading = false, projects = response.results)
        }
    }
}