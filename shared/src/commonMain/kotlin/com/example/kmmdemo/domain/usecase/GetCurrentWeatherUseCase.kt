package com.example.kmmdemo.domain.usecase

import com.example.kmmdemo.common.Result
import com.example.kmmdemo.domain.LocationService
import com.example.kmmdemo.domain.WeatherRepository
import com.example.kmmdemo.domain.model.CurrentWeather

class GetCurrentWeatherUseCase(
    private val locationService: LocationService,
    private val weatherRepository: WeatherRepository
) {
    suspend fun execute(): Result<CurrentWeather> {
        val location = locationService.getCurrentLocation()
        return weatherRepository.getWeather(latitude = location.latitude, longitude = location.longitude)
            .map { it!!.currentWeather }
    }
}
