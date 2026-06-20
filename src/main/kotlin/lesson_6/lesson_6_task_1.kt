package org.example.lesson_6

fun main() {

    println("Создайте логин:")
    val userLogin = readln()
    println("Придумайте пароль:")
    val userPassword = readln()

    while (true) {
        println("Введите логин:")
        val login = readln()
        if (login == userLogin) {
            while (true) {
                println("Введите пароль:")
                val password = readln()
                if (password == userPassword) {
                    println("Авторизация прошла успешно")
                    return
                } else {
                    println("Пароль неверный")
                }
            }
        } else {
            println("Логин неверный")
        }
    }

}