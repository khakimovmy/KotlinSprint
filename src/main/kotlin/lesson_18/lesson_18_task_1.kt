package org.example.lesson_18

class Order(val orderId: Int) {
    fun printInfo(goods: String) {
        println("Заказан товар: $goods")
    }

    fun printInfo(goods: List<String>) {
        println("Заказаны следующие товары: ${goods.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order(1)
    order1.printInfo("apple")

    val order2 = Order(2)
    order2.printInfo(listOf("lemon", "juice", "grape"))
}