package com.example.kmmdemo

interface Platform {
    val name: String
}

internal expect fun getPlatform(): Platform