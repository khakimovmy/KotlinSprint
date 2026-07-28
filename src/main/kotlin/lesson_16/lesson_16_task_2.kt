package org.example.lesson_16

private const val PI = 3.14

class Circle(private val radius: Double) {

    fun calculateCircumference() = 2 * PI * radius

    fun calculateArea() = PI * radius * radius
}

fun main() {
    val a = Circle(6.0)
    println(a.calculateCircumference())
    println(a.calculateArea())
}