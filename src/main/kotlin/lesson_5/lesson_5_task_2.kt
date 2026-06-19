package org.example.lesson_5

fun main() {

    println("Введите год рождения:")

    val currentYear = 2026
    val userAge = (currentYear - readln().toInt())

    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Доступ запрещён")

}

const val AGE_OF_MAJORITY = 18