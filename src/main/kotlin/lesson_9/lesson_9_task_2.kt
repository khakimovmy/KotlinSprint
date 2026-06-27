package org.example.lesson_9

fun main() {

    val ingredients = mutableListOf("морковь", "рис", "лук")
    println("В рецепте есть базовые ингредиенты: $ingredients")
    println("Желаете добавить еще?")
    val yesOrNo = readln()
    val yes = yesOrNo.equals("да", ignoreCase = true)

    if (yes) {
        println("Какой ингредиент вы хотите добавить?")
        ingredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    }

}