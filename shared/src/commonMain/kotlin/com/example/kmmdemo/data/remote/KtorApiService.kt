package com.example.kmmdemo.data.remote

import com.example.kmmdemo.data.model.WeatherRaw
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class KtorApiService(
    private val httpClient: HttpClient
): ApiService {

    override suspend fun getCurrentWeatherForLocation(latitude: String, longitude: String): WeatherRaw =
        httpClient.get("https://api.open-meteo.com/v1/forecast") {
            url {
                parameters.append("latitude", latitude)
                parameters.append("longitude", longitude)
                parameters.append("timezone", "auto")
                parameters.append("current_weather", "true")
            }
        }.body()
}
