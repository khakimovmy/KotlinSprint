package org.example.lesson_5

fun main() {

    println("Сколько будет 2 + 2?")

    val answer = 4
    val userAnswer = readln().toIntOrNull()

    if (userAnswer == answer) println("Добро пожаловать!")
    else println("Доступ запрещен")

}