package org.example.lesson_22

class RegularBook2(val name: String, val author: String)
data class DataBook2(val name: String, val author: String)

fun main() {
    val rb1 = RegularBook2("Childhood", "Lev Tolstoy")
    val db1 = DataBook2("The Scorpion from the Altar", "Abdulla Qodiriy")

    println(rb1) //RegularBook2 использует стандартный toString() из класса Any,
                 // поэтому вывод содержит имя класса и хеш-код объекта
    println(db1) // DataBook2 автоматически получает переопределённый toString(),
                 // который выводит значения свойств объекта
}