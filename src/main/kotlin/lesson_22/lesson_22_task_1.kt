package org.example.lesson_22

class RegularBook(val name: String, val author: String)
data class DataBook(val name: String, val author: String)

fun main() {
    val rb1 = RegularBook("Childhood", "Lev Tolstoy")
    val rb2 = RegularBook("Childhood", "Lev Tolstoy")
    val db1 = DataBook("The Scorpion from the Altar", "Abdulla Qodiriy")
    val db2 = DataBook("The Scorpion from the Altar", "Abdulla Qodiriy")

    println(rb1 == rb2) // false — одинаковые значения, но обычный класс сравнивает ссылки
    println(db1 == db2) // true — data class сравнивает значения свойств
}