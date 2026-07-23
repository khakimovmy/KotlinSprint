package org.example.lesson_12

data class Weather5(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isRaining: Boolean,
) {
    fun report() {
        println("$dayTemperature, $nightTemperature, $isRaining")
    }
}

fun main() {
    val dayTemps = (-25..40)
    val nightTemps = (-25..40)
    val bool = listOf(true, false)
    val myList = mutableListOf<Weather5>()

    repeat(30) {
        val day = Weather5(dayTemps.random(), nightTemps.random(), bool.random())
        myList.add(day)
    }

    myList.forEach { it.report() }
    println("Количество дней с осадками ${myList.count { it.isRaining }}")
    println(myList.map { it.dayTemperature }.average())
    println(myList.map { it.nightTemperature }.average())
}