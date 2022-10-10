package com.example.kmmdemo.android.di

import com.example.kmmdemo.android.presentation.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

fun androidAppModule() = module {
    viewModel {
        HomeViewModel(get(), get())
    }
}
