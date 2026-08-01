package org.example.lesson_18

class Screen {
    fun draw(x: Int, y: Int): String = "Точка: x=$x, y=$y"
    fun draw(x: Float, y: Float): String = "Точка: x=$x, y=$y"

    fun draw(x: Int, y: Int, radius: Double): String = "Круг: x=$x, y=$y, radius=$radius"
    fun draw(x: Float, y: Float, radius: Double): String = "Круг: x=$x, y=$y, radius=$radius"

    fun draw(x: Int, y: Int, size: Int): String = "Квадрат: x=$x, y=$y, size=$size"
    fun draw(x: Float, y: Float, size: Float): String = "Квадрат: x=$x, y=$y, size=$size"
}

fun main() {
    val screen = Screen()

    println(screen.draw(1, 2))
    println(screen.draw(2.3f, 3.4f))

    println(screen.draw(4, 5, 5.2))
    println(screen.draw(6.4f, 6.8f, 5.9))

    println(screen.draw(9, 8, 5))
    println(screen.draw(4.6f, 6.3f, 1.9f))
}