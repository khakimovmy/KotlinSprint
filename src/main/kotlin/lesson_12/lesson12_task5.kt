package lesson_12

import kotlin.random.Random

class Temperature5(val dayTemp: Double, val nightTemp: Double, val hasPrecipitation: Boolean)

fun List<Double>.averageOrNull(): Double = if (isNotEmpty()) average() else Double.NaN

fun main() {
    val weatherDataList = List(30) {
        Temperature5(
            dayTemp = Random.nextDouble(-10.0, 35.0),  // Температура днём
            nightTemp = Random.nextDouble(-20.0, 25.0), // Температура ночью
            hasPrecipitation = Random.nextBoolean() // Наличие осадков
        )
    }

    val dayTemperatures = weatherDataList.map { it.dayTemp }
    val nightTemperatures = weatherDataList.map { it.nightTemp }
    val daysWithPrecipitation = weatherDataList.count { it.hasPrecipitation }

    val avgDayTemp = dayTemperatures.averageOrNull()
    val avgNightTemp = nightTemperatures.averageOrNull()

    println("Средняя дневная температура: %.2f°C".format(avgDayTemp))
    println("Средняя ночная температура: %.2f°C".format(avgNightTemp))
    println("Количество дней с осадками: $daysWithPrecipitation")
}
