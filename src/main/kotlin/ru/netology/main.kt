package ru.netology

fun main() {

    val likes = 11
    @Suppress("SENSELESS_COMPARISON")
    val declination = if (likes % 10 != 1) "людям" else if (likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $declination ")
}