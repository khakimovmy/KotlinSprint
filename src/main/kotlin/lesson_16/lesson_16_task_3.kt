package org.example.lesson_16

class UserAuth {
    private val login = "user"
    protected val password = "TreX9#"

    fun checkPassword(checkPassword: String): Boolean {
        return checkPassword == this.password
    }
}

fun main() {
    val user = UserAuth()
    val password = readln()

    println(user.checkPassword(password))
}