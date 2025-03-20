package lesson_12

class Temperature4(dayTemperature: Int, nightTemperature: Int, precipitation: Boolean) {
    private val dayTemp: Int
    private val nightTemp: Int
    private val isprecipitation: Boolean

    init {
        dayTemp = dayTemperature - 273
        nightTemp = nightTemperature - 273
        isprecipitation = precipitation

        println("Днём: $dayTemp°C, Ночью: $nightTemp°C Осадки: $isprecipitation")
    }
}

fun main() {
    val weather = Temperature4(330, 290, true)
}