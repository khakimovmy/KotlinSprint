package org.example.lesson_4

fun main() {

    val todayBooked = 13
    val tomorrowBooked = 9

    println("[Доступность столиков на сегодня: ${AMOUNT_OF_TABLES > todayBooked}]\n[Доступность столиков на завтра: ${AMOUNT_OF_TABLES > tomorrowBooked}]")

}

const val AMOUNT_OF_TABLES = 13