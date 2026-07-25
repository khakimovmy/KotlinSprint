package org.example.lesson_14

import kotlin.math.pow

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun calculateArea(): Double = Math.PI * radius.pow(2)
    override fun calculatePerimeter(): Double = 2 * Math.PI * radius
}

class Rectangle(color: String, val height: Double, val width: Double) : Figure(color) {
    override fun calculateArea(): Double = height * width
    override fun calculatePerimeter(): Double = (height + width) * 2
}

fun main() {
    val figures = listOf<Figure>(
        Circle("black", 4.0),
        Circle("white", 5.0),
        Rectangle("black", 6.0, 7.0),
        Rectangle("white", 8.0, 9.0),
    )

    val blackPerimeter = figures
        .filter { it.color == "black" }
        .sumOf { it.calculatePerimeter() }

    val whiteArea = figures
        .filter { it.color == "white" }
        .sumOf { it.calculateArea() }

    println(blackPerimeter)
    println(whiteArea)
}