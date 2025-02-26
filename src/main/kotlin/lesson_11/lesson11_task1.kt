package lesson_11

import kotlin.math.log

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)
{
}

fun main() {
    val user1: User = User(
        id = 100,
        login = "Obi-Wan",
        password = "Star222",
        email = "obiwan@gmail.com"
    )

    val user2: User = User(
        id = 200,
        login = "Veider",
        password = "Darth123",
        email = "veid@gmail.com"
    )

    println("ID: ${user1.id}")
    println("Login: ${user1.login}")
    println("Password: ${user1.password}")
    println("Email: ${user1.email}")

    println()

    println("ID: ${user2.id}")
    println("Login: ${user2.login}")
    println("Password: ${user2.password}")
    println("Email: ${user2.email}")
}