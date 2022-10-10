package com.example.kmmdemo.domain

interface LocationService {
    suspend fun getCurrentLocation(): Location
}