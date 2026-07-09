package org.example.lesson_10

fun main() {
    val token = authorization(readln(), readln())
    if (token != null) println(getCart(token))
    else println("Wrong login or password")
}

fun authorization(userLogin: String, userPassword: String) =
    if (userLogin == LOGIN && userPassword == PASSWORD) generateToken() else null


fun generateToken(): String {
    val chars = ('0'..'9') + ('A'..'Z') + ('a'..'z')
    return (1..32).map { chars.random() }.joinToString("")
}

fun getCart(token: String) = listOf("apple", "onion", "salt", "sugar")

const val LOGIN = "abba"
const val PASSWORD = "123"