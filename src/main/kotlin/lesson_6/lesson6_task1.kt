package lesson_6

import kotlin.math.log

fun main() {
    println("Создать аккаунт")

    println("Создайте логин:")
    val login = readln()

    println("Создайте пароль:")
    val password = readln()

    while (true) {
        println("Введите логин:")
        val userLogin = readln()

        if (userLogin == login) {
            while (true) {
                println("Введите пароль:")
                val userPassword = readln()

                if (userPassword == password) {
                    println("Авторизация прошла успешно")
                    return
                } else {
                    println("Пароль неверный. Попробуйте снова.")
                }
            }
        } else {
            println("Логин не совпадает. Попробуйте снова.")
        }
    }
}