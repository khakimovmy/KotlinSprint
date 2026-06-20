package org.example.lesson_5

fun main() {

    val numbers = List(3) { readln().toInt() }

    val winNumbers = List(3) { (0..42).random() }

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