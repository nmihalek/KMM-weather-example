package com.example.kmmdemo.domain

import com.example.kmmdemo.common.Result
import com.example.kmmdemo.domain.model.Weather

interface WeatherRepository {
    suspend fun getWeather(latitude: String, longitude: String): Result<Weather>
}
