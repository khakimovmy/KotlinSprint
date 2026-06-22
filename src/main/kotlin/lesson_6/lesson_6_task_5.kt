package org.example.lesson_6

fun main() {

    var attempts = 3

    while (attempts > 0) {
        val num1 = (1..9).random()
        val num2 = (1..9).random()

        println("Докажите что вы не бот:\n$num1 + $num2 = ?")
        val userAnswer = readln().toIntOrNull()

        if (userAnswer == null) {
            println("Введите число!")
            continue
        }

        if (userAnswer == (num1 + num2)) {
            println("Добро пожаловать!")
            break

        } else {
            println("Неверно!")
            attempts--
        }
    }

    if (attempts == 0) println("Доступ запрещен")

}