package lesson_8

fun main() {
    println("Введите количество планируемых ингредиентов:")

    val ingredients = Array(readln().toInt()) {
        println("Введите название ингредиента:")
        readln()
    }
    println("Ваш список ингредиентов: ${ingredients.joinToString(separator = ", ")}")
}