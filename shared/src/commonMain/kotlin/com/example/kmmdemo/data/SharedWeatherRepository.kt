package com.example.kmmdemo.data

import com.example.kmmdemo.common.Result
import com.example.kmmdemo.data.model.toDomain
import com.example.kmmdemo.data.remote.ApiService
import com.example.kmmdemo.domain.WeatherRepository
import com.example.kmmdemo.domain.model.Weather

class SharedWeatherRepository(
    private val apiService: ApiService
): WeatherRepository, CoreRepository() {

    override suspend fun getWeather(latitude: String, longitude: String): Result<Weather> =
        safeApiCall {
            apiService.getCurrentWeatherForLocation(latitude = latitude, longitude = longitude)
                .toDomain()
        }
}
