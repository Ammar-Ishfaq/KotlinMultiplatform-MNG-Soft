package com.ammar.kmm_mng_soft

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform