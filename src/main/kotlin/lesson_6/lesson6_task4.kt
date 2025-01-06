package lesson_6

import kotlin.random.Random

fun main() {

    val result = Random.nextInt(1, 10)
    var attempts: Int = 5

    println("Введите число от 1 до 9:")

    while (true) {
        val userNumber = readln().toInt()
        attempts--

        if (userNumber == result) {
            println("Это была великолепная игра!")
            return
        } else if (attempts == 0) {
            println("Неверно. Попыток не осталось.")
            break
        } else {
            println("Неверно. Введите число от 1 до 9")
        }
        println("Осталось $attempts попыток")
    }
    println("Было угадано число $result")
}