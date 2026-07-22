package org.example.lesson_12

class Weather3(
    dayTemp: Int,
    nightTemp: Int,
    isRain: Boolean,
) {
    val dayTemperature: Int = (dayTemp - 273.15).toInt()
    val nightTemperature: Int = (nightTemp - 273.15).toInt()
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