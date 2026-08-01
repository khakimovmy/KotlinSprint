package org.example.lesson_18

abstract class Box {
    abstract fun surfaceArea(): Double
}

class RectangularBox(
    val l: Double,
    val w: Double,
    val h: Double,
) : Box() {
    override fun surfaceArea(): Double = 2 * (l * w + l * h + w * h)
}

class Cube(
    val ribLength: Double,
) : Box() {
    override fun surfaceArea(): Double = 6 * ribLength * ribLength
}

fun main() {
    val boxes: List<Box> = listOf(
        RectangularBox(2.0, 4.0, 3.0),
        Cube(4.0),
    )

    for (box in boxes) {
        println(box.surfaceArea())
    }
}