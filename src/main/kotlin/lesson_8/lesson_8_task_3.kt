package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("масло", "лук", "филе", "помидор", "рис", "яйцо")

    println("Введите название ингредиента:")
    val searchIngredient = readln().lowercase()

    if (searchIngredient in ingredients) {
        println("Ингредиент $searchIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в списке нет")
    }
}
