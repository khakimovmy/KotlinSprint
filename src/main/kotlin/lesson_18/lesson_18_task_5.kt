package org.example.lesson_18

open class Shape(val name: String) {
    override fun toString(): String = name
}

class Point(val x: Number, val y: Number) : Shape("Точка: x=$x, y=$y")
class Circle(val x: Number, val y: Number) : Shape("Круг: x=$x, y=$y")
class Square(val x: Number, val y: Number) : Shape("Квадрат: x=$x, y=$y")

class Screen {
    fun draw(point: Point): String = point.toString()
    fun draw(circle: Circle): String = circle.toString()
    fun draw(square: Square): String = square.toString()
}

fun main() {
    val screen = Screen()

    println(screen.draw(Point(1, 2)))
    println(screen.draw(Circle(3, 4)))
    println(screen.draw(Square(5, 6)))
}