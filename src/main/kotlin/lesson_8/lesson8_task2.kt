package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("мясо", "лук", "морковь", "рис", "яйца")

    println("Введите название ингредиента, которого хотите найти: ")
    val ingredient = readln()
    var found = false

    for (i in arrayOfIngredients) {
        if (i == ingredient) {
            found = true
            break
        }
    }

    if (found) {
        println("Ингредиент \"$ingredient\" в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}