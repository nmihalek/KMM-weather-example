package com.example.kmmdemo.data.remote

import com.example.kmmdemo.data.model.WeatherRaw

interface ApiService {
    suspend fun getCurrentWeatherForLocation(latitude: String, longitude: String): WeatherRaw
}