package org.example.lesson_9

fun main() {

    val amount = listOf(2, 50, 15)

    println("Введите количество порций:")
    val portions = readln().toInt()

    val total = amount.map {
        it * portions
    }

    println(
        "На $portions порций вам понадобится: " +
                "Яиц - ${total[0]} шт., " +
                "молока - ${total[1]} мл., " +
                "сливочного масла - ${total[2]} гр."
    )

}