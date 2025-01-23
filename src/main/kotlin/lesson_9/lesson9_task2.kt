package lesson_9

fun main() {
    val ingredients = mutableListOf("мясо", "лук", "морковь")

    println("В рецепте есть базовые ингредиенты: $ingredients")

    println("Желаете добавить еще?")
    val userAnswer = readln()

    if (userAnswer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()

        if (ingredients.any { it.equals(newIngredient, ignoreCase = true) }) {
            println("Ингредиент уже есть в списке")
        } else {
            ingredients.add(newIngredient)
            println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
        }
    } else {
        println("Хорошо")
    }
}