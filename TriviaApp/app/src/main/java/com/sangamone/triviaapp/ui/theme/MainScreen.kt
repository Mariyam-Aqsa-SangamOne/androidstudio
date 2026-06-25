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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.sangamone.triviaapp.utils.decodeHtml

@Composable
fun MainScreen(TriviaViewModel: TriviaViewModel){
    val uiState by TriviaViewModel.uistate.collectAsState()
    LaunchedEffect(Unit) {
        TriviaViewModel.triviaList()
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ){
        Text(
            "Trivia Quiz List",
            style =  MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))

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
                            .padding(8.dp),
                        elevation = CardDefaults.cardElevation(6.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor =Color(0xFFE3F2FD)

                        )
                    ){
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ){
                            Text(text = "Question: ${display.question.decodeHtml()}",
                                style = MaterialTheme.typography.titleMedium)
                            Text(text = "Correct Answer: ${display.correct_answer}")
                        }
                    }

                }
            }
        }
    }
}