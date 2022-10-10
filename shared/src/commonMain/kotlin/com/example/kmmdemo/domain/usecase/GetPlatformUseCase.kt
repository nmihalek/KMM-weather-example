package com.example.kmmdemo.domain.usecase

import com.example.kmmdemo.Platform

class GetPlatformUseCase(
    private val platform: Platform
) {
    fun execute() = platform.name
}