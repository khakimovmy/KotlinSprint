package org.example.lesson_7

import kotlin.random.Random

fun main() {

    val digits = ("0123456789")
    val lowerCase = ("abcdefghijklmnopqrstuvwxyz")
    val upperCase = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ")

    val allChars = digits + lowerCase + upperCase

    var password = ""

    println("Введите длину пароля (минимально 6):")
    val passwordLength = readln().toInt()

    if (passwordLength >= MIN_PASSWORD_LENGTH) {
        password += digits[Random.nextInt(digits.length)]
        password += lowerCase[Random.nextInt(lowerCase.length)]
        password += upperCase[Random.nextInt(upperCase.length)]
    } else {
        println("Минимальная длина - 6")
        return
    }

    for (i in 1..passwordLength - 3) {
        password += allChars[Random.nextInt(allChars.length)]
    }

    val passwordList = password.toMutableList()
    passwordList.shuffle()
    password = passwordList.joinToString("")
    println(password)

}

const val MIN_PASSWORD_LENGTH = 6