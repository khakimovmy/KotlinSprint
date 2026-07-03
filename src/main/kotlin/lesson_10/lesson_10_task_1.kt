package org.example.lesson_10

fun main() {

    val userNumber = rollTheDice()
    println("Бросает человек...\nРезультат -> $userNumber")

    val robotNumber = rollTheDice()
    println("Бросает робот...\nРезультат -> $robotNumber")

    if (userNumber > robotNumber) println("Победило человечество")
    else if (userNumber < robotNumber) println("Победила машина")
    else println("Победила дружба")

    }

fun rollTheDice(): Int {
    return (1..6).random()
}