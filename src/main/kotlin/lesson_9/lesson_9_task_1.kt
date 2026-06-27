package org.example.lesson_9

fun main() {

    val ingredients = listOf("масло", "лук", "филе", "рис", "помидор", "соль")

    println("В рецепте есть следующие ингредиенты: ${ingredients.joinToString()}")

    ingredients.forEach { ingredient ->
        println(ingredient)
    }

}