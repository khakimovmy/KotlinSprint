package org.example.lesson_20

fun main() {
    val myList = listOf("Book", "Pen", "Ruler", "Paper")

    val myLambdas: List<() -> Unit> = myList.map { element ->
        {
            println("Нажат элемент $element")
        }
    }

    myLambdas
        .filterIndexed { index, _ ->
            (index + 1) % 2 == 0
        }
        .forEach { it() }
}