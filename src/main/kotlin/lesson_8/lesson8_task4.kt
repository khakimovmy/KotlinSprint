package lesson_8

fun main() {
    val ingredients = mutableListOf("мясо", "лук", "морковь", "рис", "яйца")

    println("Список ингредиентов: ${ingredients.joinToString(", ")}")

    println("Введите название ингредиента, который хотите заменить:")
    val ingredientToReplace = readln()

    if (ingredientToReplace in ingredients) {
        println("Введите название нового ингредиета:")
        val newIngredient = readln()

        val index = ingredients.indexOf(ingredientToReplace)
        ingredients[index] = newIngredient

        println("Готово! Вот обновленный список: ${ingredients.joinToString(", ")}")
    } else {
        println("Такого ингредиента в списке нет.")
    }
}