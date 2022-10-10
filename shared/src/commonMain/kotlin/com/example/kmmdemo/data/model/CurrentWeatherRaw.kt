package com.example.kmmdemo.data.model

import com.example.kmmdemo.domain.model.CurrentWeather
import kotlinx.datetime.toLocalDateTime

@kotlinx.serialization.Serializable
data class CurrentWeatherRaw(
    val temperature: Double,
    val time: String,
    val weathercode: Double,
    val winddirection: Double,
    val windspeed: Double
)

fun CurrentWeatherRaw.toDomain() = CurrentWeather(
    temperature = temperature,
    windSpeed = windspeed,
    measurementTime = time.toLocalDateTime().hour
)