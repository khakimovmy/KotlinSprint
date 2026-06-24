package org.example.lesson_7

fun main() {

    val chars = ('a'..'z')
    val digits = (0..9)
    var password = ""
    for (i in 1..6) {
        if (i % 2 == 0) password += digits.random()
        else password += chars.random()
    }
    println(password)

}