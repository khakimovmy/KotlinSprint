package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int = filter { it % 2 == 0 }.sum()

fun main() {
    println(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).evenNumbersSum())
}