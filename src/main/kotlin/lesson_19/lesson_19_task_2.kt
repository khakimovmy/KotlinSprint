package org.example.lesson_19

enum class Category(private val title: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канц. товары"),
    OTHER("Разное");

    fun getCategoryTitle() = title
}

class Item(val name: String, val id: Int, val category: Category) {
    fun info() {
        println("Название: $name\nId: $id\nКатегория: ${category.getCategoryTitle()}")
    }
}

fun main() {
    val shirt = Item("Футболка", 1023, Category.CLOTHES)
    val ruler = Item("Линейка", 3421, Category.STATIONERY)
    val phone = Item("Телефон", 4913, Category.OTHER)

    shirt.info()
    ruler.info()
    phone.info()
}