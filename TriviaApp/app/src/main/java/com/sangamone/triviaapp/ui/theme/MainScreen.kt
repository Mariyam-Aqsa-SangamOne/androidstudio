package com.sangamone.triviaapp.ui.theme

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.lazy.items

@Composable
fun MainScreen(TriviaViewModel: TriviaViewModel){
    val uiState by TriviaViewModel.uistate.collectAsState()
    var searchText by remember { mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ){
        Text(
            "Trivia Quiz List",
            style =  MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it},
            label = { Text("Display the list")},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = {TriviaViewModel.triviaList(searchText)}){
            Text("Display")
        }

        Spacer(modifier = Modifier.height(40.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Result Count: ${uiState.projects.size}")

            if(uiState.isLoading){
                CircularProgressIndicator()
            }
            uiState.errorMsg?.let { msg ->
                Text(
                    text = msg,
                    color = Color.Red
                )
            }
            LazyColumn {
                items(uiState.projects) { display ->

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ){
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ){
                            Text(text = "Question: ${display.question}")
                            Text(text = "Correct Answer: ${display.correct_answer}")
                            Text(text = "Incorrect Answer: ${display.incorrect_answers.joinToString()}")
                        }
                    }

                }
            }
        }
    }
}