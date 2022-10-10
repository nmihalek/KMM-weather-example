package com.example.kmmdemo.android.presentation.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.kmmdemo.android.presentation.model.WeatherUiState
import com.example.kmmdemo.common.Resource

@Composable
fun HomeScreen(
    platform: String,
    weatherUiState: Resource<WeatherUiState>,
    onGetWeatherPressed: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Platform: $platform"
                )
            }
        }
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            when(weatherUiState) {
                is Resource.Success -> {
                    val weatherData = weatherUiState.data
                    Column(
                        modifier = Modifier.align(Alignment.Center),
                        verticalArrangement = Arrangement.spacedBy(15.dp)
                    ) {
                        Text(text = "Temperature: ${weatherData.temperature} °C")
                        Text(text = "Wind speed: ${weatherData.windSpeed} km/h")
                        Text(text = "Measurement time: ${weatherData.lastUpdate}h")
                    }
                }
                is Resource.Loading -> {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                is Resource.Error -> {
                    Text(
                        modifier = Modifier.align(Alignment.Center),
                        text = weatherUiState.error!!.message!!
                    )
                }
                is Resource.Empty -> {}
            }
            Button(
                modifier = Modifier.align(Alignment.BottomCenter),
                onClick = onGetWeatherPressed
            ) {
                Text(text = "Get current weather")
            }
        }
    }
}
