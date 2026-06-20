package org.example.lesson_5

fun main() {

    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()

    val winNumber1 = (0..42).random()
    val winNumber2 = (0..42).random()
    val winNumber3 = (0..42).random()

    val numbers = listOf(number1, number2, number3)
    val winNumbers = listOf(winNumber1, winNumber2, winNumber3)

    val matches = winNumbers.intersect(numbers)
    val count = matches.size

    when (count) {
        3 -> println("Ты угадал все числа и выиграл джекпот")
        2 -> println("Ты угадал два числа и получаешь крупный приз")
        1 -> println("Тебе выплачивается утешительный приз")
        0 -> println("Ты не угадал ни одного числа")
    }

    println("Выигрышными числами были: $winNumbers")

}