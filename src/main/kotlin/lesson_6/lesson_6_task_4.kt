package org.example.lesson_6

fun main() {

    val winNumber = (1..9).random()
    var attempts = 5

    while (attempts > 0) {
        println("Введите число от 1 до 9:")
        val userNumber = readln().toInt()

        if (userNumber == winNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            attempts--
            println("Неверно. Осталось ${attempts} попыток")
        }
    }

    println("Было загадано число $winNumber")

}