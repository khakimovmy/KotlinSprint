package org.example.lesson_19

enum class Category(private val title: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канц. товары"),
    OTHER("Разное");

    fun categoryTitle() = title
}

class Item(val name: String, val id: Int, val category: Category) {
    fun info(): String {
        return "Название: $name\nId: $id\nКатегория: ${category.categoryTitle()}"
    }
}

fun main() {
    val shirt = Item("Футболка", 1023, Category.CLOTHES)
    val ruler = Item("Линейка", 3421, Category.STATIONERY)
    val phone = Item("Телефон", 4913, Category.OTHER)

    println(shirt.info())
    println(ruler.info())
    println(phone.info())
}