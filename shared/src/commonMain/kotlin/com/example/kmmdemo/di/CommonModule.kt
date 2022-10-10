package com.example.kmmdemo.di

import com.example.kmmdemo.data.DummyLocationService
import com.example.kmmdemo.data.SharedWeatherRepository
import com.example.kmmdemo.data.remote.ApiService
import com.example.kmmdemo.data.remote.KtorApiService
import com.example.kmmdemo.data.remote.KtorClient
import com.example.kmmdemo.domain.usecase.GetCurrentWeatherUseCase
import com.example.kmmdemo.domain.LocationService
import com.example.kmmdemo.domain.WeatherRepository
import com.example.kmmdemo.domain.usecase.GetPlatformUseCase
import com.example.kmmdemo.getPlatform
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(commonModule())
    }

// Called by iOS
fun initKoinIOS() = initKoin()

fun commonModule() = module {
    single { getPlatform() }

    single<ApiService> { KtorApiService(get()) }
    single { KtorClient.client }

    single<LocationService> { DummyLocationService() }

    single<WeatherRepository> { SharedWeatherRepository(get()) }

    single { GetCurrentWeatherUseCase(get(), get()) }
    single { GetPlatformUseCase(get()) }
}
