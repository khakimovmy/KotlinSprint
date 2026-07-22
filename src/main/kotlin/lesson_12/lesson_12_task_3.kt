package org.example.lesson_12

class Weather3(
    dayTemp: Int,
    nightTemp: Int,
    isRain: Boolean,
) {
    val dayTemperature: Int = dayTemp - TO_CELSIUS
    val nightTemperature: Int = nightTemp - TO_CELSIUS
    val precipitation: Boolean = isRain

    fun report() {
        println("$dayTemperature, $nightTemperature, $precipitation")
    }
}

fun main() {
    val day1 = Weather3(300, 320, true)
    val day2 = Weather3(340, 360, false)

    day1.report()
    day2.report()
}

const val TO_CELSIUS = 273