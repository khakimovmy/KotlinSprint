package org.example.lesson_4

fun main() {

    println("Груз с весом 20 кг и объемом 80 л соответствует категории 'Average':" +
            "${(20 > AVERAGE_MIN_WEIGHT && 20 <= AVERAGE_MAX_WEIGHT) && (80 < AVERAGE_MAX_VOLUME)}")

    println("Груз с весом 50 кг и объемом 100 л соответствует категории 'Average':" +
            "${(50 > AVERAGE_MIN_WEIGHT && 50 <= AVERAGE_MAX_WEIGHT) && (100 < AVERAGE_MAX_VOLUME)}")

}

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_MAX_VOLUME = 100