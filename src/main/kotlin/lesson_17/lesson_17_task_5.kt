package org.example.lesson_17

class Data(userLogin: String, userPassword: String) {
    private val _password = userPassword

    var login: String = userLogin
        set(value) {
            field = value
            println("Логин успешно изменён")
        }

    var password: String
        get() = "*".repeat(_password.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user1 = Data("admin", "1234")
    println(user1.login)
    user1.login = "snake"

    println(user1.password)
    user1.password = "7777"
}