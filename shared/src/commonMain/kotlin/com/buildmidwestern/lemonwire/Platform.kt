package com.buildmidwestern.lemonwire

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform