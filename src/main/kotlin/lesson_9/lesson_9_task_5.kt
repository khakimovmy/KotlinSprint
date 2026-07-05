package org.example.lesson_9

fun main() {

    val allIngredients = mutableListOf<String>()

    println("Введите название ингредиента: ")

    for (i in 1..5) {
        allIngredients.add(readln())
    }

    val result = allIngredients
        .distinct()
        .sorted()
        .mapIndexed { index, element ->
            if (index == 0) {
                element.replaceFirstChar { it.uppercase() }
            } else {
                element
            }
        }

    println(result.joinToString())
}