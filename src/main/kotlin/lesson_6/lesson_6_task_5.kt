package org.example.lesson_6

fun main() {

    var attempts = 3

    println("Введите логин:")
    val login = readln()

    if (login == LOGIN) {
        println("Введите пароль:")
        val password = readln()
        if (password == PASSWORD) {
            while (attempts > 0) {
                val num1 = (1..9).random()
                val num2 = (1..9).random()

                println("Докажите что вы не бот:\n$num1 + $num2 = ?")
                val userAnswer = readln().toInt()

                if (userAnswer == (num1 + num2)) {
                    println("Добро пожаловать!")
                    break

                } else {
                    println("Неверно!")
                    attempts--
                }
            }
        } else println("Пароль неверный")

    } else println("Пользователь не найден. Пожалуйста, зарегистрируйтесь.")

    if (attempts == 0) println("Доступ запрещен")

}

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"