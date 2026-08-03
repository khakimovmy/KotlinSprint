package org.example.lesson_20

fun main() {
    val myList = listOf("Book", "Pen", "Ruler", "Paper")

    val myLambdas: List<() -> Unit> = myList.map { element ->
        {
            println("Нажат элемент $element")
        }
    }

    myLambdas.forEachIndexed { index, lambda ->
        if (index % 2 == 0) {
            lambda()
        }
    }
}