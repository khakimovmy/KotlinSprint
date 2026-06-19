package org.example.lesson_4

fun main() {

    val weatherNow: String = "солнечная"
    val isTentOpenNow: Boolean = true
    val humidityNow: Int = 20
    val seasonNow: String = "зима"

    val isFavorable = (WEATHER == weatherNow) && (IS_TENT_OPEN == isTentOpenNow) && (HUMIDITY == humidityNow) && (UNFAVORABLE_SEASON != seasonNow)

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorable")

}

const val WEATHER = "солнечная"
const val IS_TENT_OPEN = true
const val HUMIDITY = 20
const val UNFAVORABLE_SEASON = "зима"