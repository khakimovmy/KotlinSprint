package org.example.lesson_9

fun main() {

    println("Введите название ингредиента через разделитель \", \":")
    val ingredients = readln().split(", ")

    if (ingredients.size != 5) {
        println("Введите 5 ингредиентов, используя разделитель \", \"!")
        return
    }

    println(ingredients.sorted())
}