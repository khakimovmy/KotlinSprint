package org.example.lesson_18

class Screen {
    fun drawPoint(x: Int, y: Int): String = "Точка: x=$x, y=$y"
    fun drawPoint(x: Float, y: Float): String = "Точка: x=$x, y=$y"

    fun drawCircle(x: Int, y: Int): String = "Круг: x=$x, y=$y"
    fun drawCircle(x: Float, y: Float): String = "Круг: x=$x, y=$y"

    fun drawSquare(x: Int, y: Int): String = "Квадрат: x=$x, y=$y"
    fun drawSquare(x: Float, y: Float): String = "Квадрат: x=$x, y=$y"
}

fun main() {
    val screen = Screen()

    println(screen.drawPoint(1, 2))
    println(screen.drawPoint(1.5f, 2.5f))

    println(screen.drawCircle(3, 4))
    println(screen.drawCircle(3.5f, 4.3f))

    println(screen.drawSquare(5, 6))
    println(screen.drawSquare(5.5f, 6.5f))
}