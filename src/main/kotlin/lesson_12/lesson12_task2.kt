package lesson_12

class Temperature2(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val precipitation: Boolean,
) {

    fun printInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков в течение суток: $precipitation")
    }
}

fun main() {

    val dayOne = Temperature2(12, 31, false)
    val dayTwo = Temperature2(19, 23, true)

    dayOne.printInfo()
    println()
    dayTwo.printInfo()
}