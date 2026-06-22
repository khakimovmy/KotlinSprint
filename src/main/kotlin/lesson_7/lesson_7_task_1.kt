package org.example.lesson_7

import kotlin.random.Random

fun main() {

    val chars = "abcdefghijklmnopqrstuvwxyz"
    val digits = "0123456789"
    var password = ""
    for (i in 1..6) {
        if (i % 2 == 0) password += digits[Random.nextInt(digits.length)]
        else password += chars[Random.nextInt(chars.length)]
    }
    println(password)

}