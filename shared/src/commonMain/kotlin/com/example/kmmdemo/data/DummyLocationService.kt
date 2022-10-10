package com.example.kmmdemo.data

import com.example.kmmdemo.domain.Location
import com.example.kmmdemo.domain.LocationService

class DummyLocationService: LocationService {

    private val locationNoviSad = Location("52.52", "13.41")

    override suspend fun getCurrentLocation(): Location = locationNoviSad

}