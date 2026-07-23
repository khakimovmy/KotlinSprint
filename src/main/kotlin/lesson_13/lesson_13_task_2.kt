package org.example.lesson_13

class Phone2(
    val name: String,
    val phone: Long,
    val company: String? = null,
) {
    fun report() {
        println(
            "Имя: $name\n" +
                    "Номер: $phone\n" +
                    "Компания: ${company ?: "не указано"}"
        )
    }
}

fun main() {
    val phone1 = Phone2("Anna", 1234567890)
    phone1.report()
}