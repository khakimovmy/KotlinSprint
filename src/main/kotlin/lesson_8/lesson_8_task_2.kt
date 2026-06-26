package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("масло", "лук", "филе", "помидор", "рис", "яйцо")

    println("Введите название ингредиента:")
    val searchIngredient = readln().lowercase()

    for (i in ingredients) {
        if (i == searchIngredient) {
            println("Ингредиент $i в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в списке нет")

}