package org.example.lesson_7

import kotlin.random.Random

fun main() {

    val digits = (0..9)
    val lowerCase = ('a'..'z')
    val upperCase = ('A'..'Z')

    val allChars = digits + lowerCase + upperCase

    var password = ""

    println("Введите длину пароля (минимальная длина - 6):")
    val passwordLength = readln().toInt()

    if (passwordLength >= MIN_PASSWORD_LENGTH) {
        password += digits.random()
        password += lowerCase.random()
        password += upperCase.random()
    } else {
        println("Минимальная длина - 6")
        return
    }

    for (i in 1..passwordLength - 3) {
        password += allChars.random()
    }

    val passwordList = password.toMutableList()
    passwordList.shuffle()
    password = passwordList.joinToString("")
    println(password)

}

const val MIN_PASSWORD_LENGTH = 6