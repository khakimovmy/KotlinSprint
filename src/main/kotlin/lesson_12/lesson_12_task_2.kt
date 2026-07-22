package org.example.lesson_12

class Weather2(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var precipitation: Boolean,
) {
    fun report() {
        println("$dayTemperature, $nightTemperature, $precipitation")
    }
}

fun main() {
    val day1 = Weather2(22, 16, true)
    val day2 = Weather2(26, 22, false)

    day1.report()
    day2.report()
}