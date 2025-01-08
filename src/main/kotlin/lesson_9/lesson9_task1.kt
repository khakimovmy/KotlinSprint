package lesson_9

fun main() {
    val ingredients = mutableListOf("мясо", "лук", "морковь", "рис", "яйца")

    println("В рецепте есть следующие ингредиенты:")
    ingredients.forEach { println(it)}
}