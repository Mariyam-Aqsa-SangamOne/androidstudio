package com.sangamone.triviaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sangamone.triviaapp.ui.theme.TriviaAppTheme
import com.sangamone.triviaapp.ui.theme.MainScreen
import com.sangamone.triviaapp.ui.theme.TriviaViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TriviaAppTheme {
                val viewModel: TriviaViewModel = viewModel()
                MainScreen(viewModel)
                }
            }
        }
    }


