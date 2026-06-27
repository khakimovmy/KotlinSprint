package org.example.lesson_8

fun main() {

    println("Сколько ингредиентов планируете вводить?:")
    val size = readln().toInt()

    val name = Array(size) { readln() }
    println(name.joinToString())

}