package lesson_9

fun main() {
    val ingredients = mutableSetOf<String>()

    println("Введите пять названий ингредиентов (каждый по отдельности):")
    while (ingredients.size < 5) {
        val ingredient = readln().trim().lowercase()
        if (ingredient.isNotEmpty()) {
            ingredients.add(ingredient)
        } else {
            println("Ингредиент не может быть пустым. Попробуйте снова.")
        }
    }
    val sortedIngredient = ingredients.sorted()

    val formattedIngredients =
        sortedIngredient.joinToString(", ", postfix = ".").replaceFirstChar { it.uppercaseChar() }
    println("Список ингредиентов: $formattedIngredients")
}