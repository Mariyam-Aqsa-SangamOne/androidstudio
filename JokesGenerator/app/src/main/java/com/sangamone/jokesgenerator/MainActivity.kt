package com.sangamone.jokesgenerator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sangamone.jokesgenerator.ui.theme.JokesGeneratorTheme

import androidx.lifecycle.viewmodel.compose.viewModel
import com.sangamone.jokesgenerator.ui.theme.JokeViewModel
import com.sangamone.jokesgenerator.ui.theme.MainScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            JokesGeneratorTheme {

                val viewModel: JokeViewModel = viewModel()

                MainScreen(viewModel)

            }

        }

    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JokesGeneratorTheme {
        Greeting("Android")
    }
}