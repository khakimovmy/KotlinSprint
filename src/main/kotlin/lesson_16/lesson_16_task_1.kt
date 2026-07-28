package org.example.lesson_16

class Dice {
    private val roll: Int = (1..6).random()

    fun printResult() {
        println("Выпало число: $roll")
    }
}

fun main() {
    val dice = Dice()
    dice.printResult()
}