package lesson_12

class Temperature() {
    var dayTemperature: Int = 25
    var nightTemperature: Int = 10
    var precipitation: Boolean = false

    fun printInfo() {
        println("Дневная температура: ${this.dayTemperature}°C")
        println("Ночная температура: ${this.nightTemperature}°C")
        println("Наличие осадков в течение суток: ${this.precipitation}")
    }
}

fun main() {

    val dayOne = Temperature()
    dayOne.dayTemperature = 12
    dayOne.nightTemperature = 32
    dayOne.precipitation = false

    val dayTwo = Temperature()
    dayTwo.dayTemperature = 15
    dayTwo.nightTemperature = 24
    dayTwo.precipitation = true

    dayOne.printInfo()
    println()
    dayTwo.printInfo()
}