package org.example.lesson_11

class User (
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user1: User = User(
        id = 1,
        login = "wizard",
        password = "oop123",
        email = "wizard@mail.ru"
    )

    val user2: User = User(
        id = 2,
        login = "doctor",
        password = "house123",
        email = "doctor@gmail.com"
    )

    println("${user1.id}, ${user1.login}, ${user1.password}, ${user1.email}" )
    println("${user2.id}, ${user2.login}, ${user2.password}, ${user2.email}" )
}