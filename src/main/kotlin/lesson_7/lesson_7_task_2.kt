package org.example.lesson_7

fun main() {

    while (true) {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        println("Введите код:")
        val userCode = readln().toIntOrNull()

        if ((userCode == code)) {
            println("Добро пожаловать!")
            return
        }
    }

}