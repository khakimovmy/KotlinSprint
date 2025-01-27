package lesson_8

fun main() {
    println("Введите количество планируемых ингредиентов:")
    val ingredientSize = readln().toInt()

    val ingredients = Array(ingredientSize) { "" }

    for (i in 0 until ingredientSize) {
        println("Введите название ингредиента:")
        ingredients[i] = readln()
    }

    println("Ваш список ингредиентов: ${ingredients.joinToString(separator = ", ")}")
}