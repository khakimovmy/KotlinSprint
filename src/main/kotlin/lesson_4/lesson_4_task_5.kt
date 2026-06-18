package org.example.lesson_4

fun main() {

    val isCorpusGood = readln().toBoolean()
    val currentCrew = readln().toInt()
    val amountOfBaggage = readln().toInt()
    val isGoodWeather = readln().toBoolean()

    val canTravel =
        (isCorpusGood == IS_NOT_DAMAGED
                && currentCrew >= MIN_CREW
                && currentCrew <= MAX_CREW
                && amountOfBaggage > MIN_BAGGAGE
                && (isGoodWeather == WEATHER || isGoodWeather != WEATHER))
                || (isCorpusGood != IS_NOT_DAMAGED
                && currentCrew == MAX_CREW
                && isGoodWeather == WEATHER
                && amountOfBaggage >= MIN_BAGGAGE)

    println(canTravel)
}

const val IS_NOT_DAMAGED = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_BAGGAGE = 50
const val WEATHER = true