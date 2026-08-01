package org.example.lesson_18

class Screen {

    fun draw(pointX: Int, pointY: Int): String =
        "Точка: x=$pointX, y=$pointY"

    fun draw(pointX: Float, pointY: Float): String =
        "Точка: x=$pointX, y=$pointY"


    fun draw(circleX: Int, circleY: Int, radius: Int): String =
        "Круг: x=$circleX, y=$circleY"

    fun draw(circleX: Float, circleY: Float, radius: Float): String =
        "Круг: x=$circleX, y=$circleY"


    fun draw(squareX: Int, squareY: Int, side: String): String =
        "Квадрат: x=$squareX, y=$squareY"

    fun draw(squareX: Float, squareY: Float, side: String): String =
        "Квадрат: x=$squareX, y=$squareY"
}

fun main() {
    val screen = Screen()

    println(screen.draw(1, 2))
    println(screen.draw(1.5f, 2.5f))

    println(screen.draw(3, 4, 10))
    println(screen.draw(3.5f, 4.5f, 10f))

    println(screen.draw(5, 6, ""))
    println(screen.draw(5.5f, 6.5f, ""))
}