package org.example.lesson_20

class Robot {
    private val words: List<String> = listOf("Papa", "Mama", "Sister", "Brother", "Family")
    private var modifier: (String) -> String = { it }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    fun say() {
        val word = words.random()
        println(modifier(word))
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { it.reversed() }
    robot.say()
}

