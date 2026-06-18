package org.example.lesson_3

fun main() {

    val move = "D2-D4;0"

    val detailed = move.split("-", ";")
    val from = detailed[0]
    val to = detailed[1]
    val number = detailed[2]

    println(from)
    println(to)
    println(number)

}