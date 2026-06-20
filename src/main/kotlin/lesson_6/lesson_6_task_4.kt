package org.example.lesson_6

fun main() {

    val winNumber = 3
    var attempts = 5
    var isWin = false

    while (attempts > 0) {
        println("Введите число от 1 до 9:")
        val userNumber = readln().toInt()
        --attempts

        if (userNumber == winNumber) {
            println("Это была великолепная игра!")
            isWin = true
            break
        } else {
            println("Неверно. Осталось ${attempts} попыток")
        }
    }

    if (!isWin) println("Было загадано число $winNumber")

}