package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("масло", "лук", "филе", "помидор", "рис", "яйцо")
    println(ingredients.joinToString(", "))

    println("Введите название ингредиента для замены:")
    val ingredientToReplace = readln().lowercase()

    if (ingredientToReplace in ingredients) {
        println("На какой хотите изменить:")
        val newName = readln().lowercase()
        val index = ingredients.indexOf(ingredientToReplace)
        ingredients[index] = newName
        println("Готово! Вы сохранили следующий список: ${ingredients.joinToString(", ")}")
    } else {
        println("Такого ингредиента в списке нет")
    }

}
