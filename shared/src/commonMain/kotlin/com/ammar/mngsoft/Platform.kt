package com.ammar.mngsoft

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform