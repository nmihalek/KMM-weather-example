package com.example.kmmdemo

import com.example.kmmdemo.domain.usecase.GetPlatformUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetPlatformHelper: KoinComponent {
    private val platform: GetPlatformUseCase by inject()
    fun execute() = platform.execute()
}