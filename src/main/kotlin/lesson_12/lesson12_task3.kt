package lesson_12

class Temperature3(dayTemperature: Int, nightTemperature: Int, precipitation: Boolean) {
    private val dayTemperature: Int = dayTemperature - 273
    private val nightTemperature: Int = dayTemperature - 273
    private val precipitation: Boolean = precipitation

    fun printWeather() {
        println("Днём: ${dayTemperature}°C, Ночью: ${nightTemperature}°C, Осадки: $precipitation")
    }
}

fun main() {
    val weather = Temperature3(400, 1234, true)
    weather.printWeather()
}