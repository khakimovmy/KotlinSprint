package org.example.lesson_12

class Weather {
    var dayTemperature: Int = 20
    var nightTemperature: Int = 24
    var precipitation: Boolean = false

    fun report() {
        println("$dayTemperature, $nightTemperature, $precipitation")
    }
}

fun main() {
    val day1 = Weather()
    day1.dayTemperature = 22
    day1.nightTemperature = 16
    day1.precipitation = true
    day1.report()

    val day2 = Weather()
    day2.dayTemperature = 26
    day2.nightTemperature = 22
    day2.precipitation = false
    day2.report()
}