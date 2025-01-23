package lesson_9

fun main() {
    val ingredients = listOf(2, 50, 15)

    println("Введите количество порций:")
    val portion = readln().toInt()

    val totalIngredients = ingredients.map { it * portion }

    val ingredientNames = listOf("яиц", "молока", "сливочного масла")
    val result = ingredientNames.zip(totalIngredients) { name, amount ->
        "$name – $amount"
    }.joinToString(", ")

    println("На $portion порций вам понадобится: $result.")
}