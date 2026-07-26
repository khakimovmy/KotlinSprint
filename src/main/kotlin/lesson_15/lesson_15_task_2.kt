package org.example.lesson_15

abstract class WeatherStationStats

class Temperature(val temp: Int) : WeatherStationStats()
class PrecipitationAmount(val precipitationAmount: Int) : WeatherStationStats()

class WeatherServer {
    fun sendMessageToServer(stats: WeatherStationStats) {
        if (stats is Temperature) {
            println("Temperature: ${stats.temp}")
        } else if (stats is PrecipitationAmount) {
            println("Precipitation amount: ${stats.precipitationAmount}")
        }
    }
}

fun main() {
    val server = WeatherServer()

    val day1 = Temperature(24)
    val day2 = PrecipitationAmount(90)

    server.sendMessageToServer(day1)
    server.sendMessageToServer(day2)
}