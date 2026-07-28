package org.example.lesson_16

class Circle(private val radius: Double) {
    private val pi = 3.14

    fun calculateCircumference() = 2 * pi * radius

    fun calculateArea() = pi * radius * radius
}

fun main() {
    val a = Circle(6.0)
    println(a.calculateCircumference())
    println(a.calculateArea())
}