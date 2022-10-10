package com.example.kmmdemo

import com.example.kmmdemo.domain.usecase.GetCurrentWeatherUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetCurrentWeatherHelper: KoinComponent {
    private val useCase: GetCurrentWeatherUseCase by inject()
    suspend fun execute() = useCase.execute()
}