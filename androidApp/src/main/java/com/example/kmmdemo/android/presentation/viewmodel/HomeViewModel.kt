package com.example.kmmdemo.android.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kmmdemo.android.presentation.model.WeatherUiState
import com.example.kmmdemo.common.Resource
import com.example.kmmdemo.common.collectOrError
import com.example.kmmdemo.domain.usecase.GetCurrentWeatherUseCase
import com.example.kmmdemo.domain.usecase.GetPlatformUseCase
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

class HomeViewModel(
    private val getCurrentWeatherUseCase: GetCurrentWeatherUseCase,
    getPlatformUseCase: GetPlatformUseCase
): ViewModel() {

    var weatherState by mutableStateOf<Resource<WeatherUiState>>(Resource.Empty())

    val platform = getPlatformUseCase.execute()

    fun showCurrentWeather() {
        weatherState = Resource.Loading()
        viewModelScope.launch {
            getCurrentWeatherUseCase.execute()
                .collectOrError(
                    onSuccess = { currentWeather ->
                        weatherState = Resource.Success(WeatherUiState(
                            temperature = currentWeather.temperature.roundToInt().toString(),
                            windSpeed = currentWeather.windSpeed.roundToInt().toString(),
                            lastUpdate = currentWeather.measurementTime.toString()
                        ))
                    },
                    onError = {
                        weatherState = Resource.Error(it)
                    }
                )
        }
    }
}
