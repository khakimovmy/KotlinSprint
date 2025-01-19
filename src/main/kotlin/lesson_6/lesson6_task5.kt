package lesson_6

import kotlin.random.Random

fun main() {
    var attempts = 3

    println("Создать аккаунт")

    println("Создайте логин:")
    val login = readln()

    println("Создайте пароль:")
    val password = readln()

    println("Авторизация")

    while (true) {
        println("Введите логин:")
        val userLogin = readln()

        if (userLogin == login) {
            while (true) {
                println("Введите пароль:")
                val userPassword = readln()

                if (userPassword == password) {
                    println("Логин и пароль верны!")
                    println("Докажите что вы не бот")
                    println("Решите пример:")

                    while (true) {
                        val number1 = Random.nextInt(1, 10)
                        val number2 = Random.nextInt(1, 10)
                        val result: Int = number1 + number2
                        attempts--
                        println("Сколько будет $number1 + $number2")
                        val userAnswer = readln().toInt()

                        if (userAnswer == result) {
                            println("Добро пожаловать!")
                            return
                        } else if (attempts == 0) {
                            println("Доступ запрещен")
                            return
                        }
                        println("Осталось $attempts попыток")

                    }
                } else {
                    println("Пароль неверный. Попробуйте снова.")
                }
            }
        } else {
            println("Логин не совпадает. Попробуйте снова.")
        }
    }
}