package lesson_6

import kotlin.random.Random

fun main() {

    val result = Random.nextInt(1, 10)
    var attempts: Int = 5

    println("Введите число от 1 до 9:")

    while (attempts > 0) {
        val userNumber = readln().toInt()
        attempts--

        when {
            userNumber == result -> {
                println("Это была великолепная игра!")
                return // Завершаем программу, если угадали
            }

            attempts == 0 -> {
                println("Неверно. Попыток не осталось.")
                break // Прерываем цикл, если попытки закончились
            }

            else -> {
                println("Неверно. Введите число от 1 до 9")
                println("Осталось $attempts попыток")
            }
        }
    }
    println("Было угадано число $result")
}