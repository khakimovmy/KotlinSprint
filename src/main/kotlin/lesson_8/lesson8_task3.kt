package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("мясо", "лук", "морковь", "рис", "яйца")

    println("Введите название ингредиента, которого хотите найти: ")
    val ingredient = readln()

    if (ingredient in arrayOfIngredients) {
        println("Ингредиент \"$ingredient\" в рецепте есть")

    } else {
        println("Такого ингредиента в рецепте нет")
    }
}