package lesson_9

fun main() {
    println("Пожалуйста, введите 5 ингредиентов через запятую и пробел \", \"")
    val input = readln()

    val ingredients = input.split(", ").toMutableList()

    if (ingredients.size != 5) {
        println("Ошибка: введите ровно 5 ингредиентов, разделяя их запятой и пробелом.")
        return
    }

    val sortedIngredients = ingredients.sorted()

    println("Ингредиенты в алфавитном порядке: $sortedIngredients")
}
