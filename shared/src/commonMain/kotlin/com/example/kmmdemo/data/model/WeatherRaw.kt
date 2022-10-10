package com.example.kmmdemo.data.model

import com.example.kmmdemo.domain.model.Weather
import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class WeatherRaw(
    @SerialName("current_weather")
    val currentWeather: CurrentWeatherRaw,
    val elevation: Double,
    @SerialName("generationtime_ms")
    val generationtimeMs: Double,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    @SerialName("timezone_abbreviation")
    val timezoneAbbreviation: String,
    @SerialName("utc_offset_seconds")
    val utcOffsetSeconds: Int
)

fun WeatherRaw.toDomain() = Weather(currentWeather = currentWeather.toDomain())