package org.example.lesson_12

class Weather4(
    dayTemp: Int,
    nightTemp: Int,
    isRain: Boolean,
) {
    init {
        println("$dayTemp, $nightTemp, $isRain")
    }
}

fun main() {
    val day1 = Weather4(25, 20, true)
    val day2 = Weather4(22, 18, false)
}
