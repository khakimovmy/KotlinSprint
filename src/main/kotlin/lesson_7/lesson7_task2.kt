package lesson_7

import kotlin.random.Random

fun main() {
    var code: Int = Random.nextInt(1000, 10000)
    println("Ваш код авторизации: $code")

    while (true) {
        println("Введите четырехзначный код:")
        val userCode = readln().toInt()

        if (userCode == code) {
            println("Добро пожаловать!")
            break
        } else {
            println("Неверно.")
            code = Random.nextInt(1000, 10000)
            println("Новый код: $code")
        }
    }
}