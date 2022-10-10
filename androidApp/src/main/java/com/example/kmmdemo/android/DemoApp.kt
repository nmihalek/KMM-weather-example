package com.example.kmmdemo.android

import android.app.Application
import com.example.kmmdemo.android.di.androidAppModule
import com.example.kmmdemo.di.commonModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class DemoApp: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            androidContext(this@DemoApp)
            modules(commonModule(), androidAppModule())
        }
    }
}