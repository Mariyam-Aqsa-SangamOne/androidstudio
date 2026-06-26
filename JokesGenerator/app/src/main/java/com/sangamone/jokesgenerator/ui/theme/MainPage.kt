package com.sangamone.jokesgenerator.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(jokeViewModel: JokeViewModel) {

    val uiState by jokeViewModel.uistate.collectAsState()

    LaunchedEffect(Unit) {
        jokeViewModel.getJoke()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Dad Joke Generator",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(20.dp))

        if (uiState.isLoading) {
            CircularProgressIndicator()
        }

        uiState.errorMsg?.let {
            Text(
                text = it,
                color = Color.Red
            )
        }

        uiState.joke?.let { joke ->

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(6.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFEDE7F6)
                )
            ) {

                Column(
                    modifier = Modifier.padding(20.dp)
                ) {

                    Text(
                        text = joke.joke,
                        style = MaterialTheme.typography.bodyLarge
                    )

                }

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                jokeViewModel.getJoke()
            }
        ) {
            Text("Get Another Joke")
        }

    }

}