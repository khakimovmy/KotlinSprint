package org.example.lesson_16

class UserAuth(
    private val login: String,
    private val password: String,
) {

    fun checkPassword(checkPassword: String): Boolean {
        return checkPassword == this.password
    }
}

fun main() {
    val user = UserAuth("user", "ASN9af9m$")
    val password = readln()

    println(user.checkPassword(password))
}