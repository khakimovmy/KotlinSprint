package org.example.lesson_6

fun main() {

    println("Создайте логин:")
    val userLogin = readln()
    println("Придумайте пароль:")
    val userPassword = readln()

    while (true) {
        println("Введите логин:")
        val login = readln()
        println("Введите пароль:")
        val password = readln()

        if ((login == userLogin) && (password == userPassword)) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Неверный логин или пароль")
        }
    }

}