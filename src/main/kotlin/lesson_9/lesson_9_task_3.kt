package org.example.lesson_9

fun main() {

    val amount = mutableListOf(2, 50, 15)

    println("Введите количество порций:")
    val portions = readln().toInt()

    for (i in amount.indices) {
        amount[i] *= portions
    }

    println(
        "На $portions порций вам понадобится: " +
                "Яиц - ${amount[0]} шт., " +
                "молока - ${amount[1]} мл., " +
                "сливочного масла - ${amount[2]} гр."
    )

}