package org.example.lesson_10

fun main() {

    println("Введите логин:")
    val userLogin = readln()

    println("Введите пароль:")
    val userPassword = readln()

    val userLoginAndPassword = loginAndPassword(userLogin, userPassword)

    if (userLoginAndPassword) println("Добро пожаловать!")
    else println("Логин или пароль недостаточно длинные")

}

fun loginAndPassword(login: String, password: String): Boolean {
    return login.length >= 4 && password.length >= 4
}