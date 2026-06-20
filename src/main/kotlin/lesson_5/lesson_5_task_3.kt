package org.example.lesson_5

fun main() {

    println("Введите первое число от 0 до 42:")
    val userNum1 = readln().toInt()

    println("Введите второе число от 0 до 42:")
    val userNum2 = readln().toInt()

    val winNum1 = 10
    val winNum2 = 22

    val message = if ((userNum1 == winNum1 && userNum2 == winNum2) || (userNum1 == winNum2 && userNum2 == winNum1))
        "Поздравляем! Вы выиграли главный приз!"
    else if (userNum1 == winNum1 || userNum1 == winNum2 || userNum2 == winNum1 || userNum2 == winNum2)
        "Вы выиграли утешительный приз!"
    else
        "Неудача!"

    println(message)

    println("Победными числами были: $winNum1 и $winNum2")

}