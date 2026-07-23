package org.example.lesson_13

class Phone4(
    val name: String,
    val phone: Long?,
    val company: String? = null,
) {
    fun report() {
        println("$name, $phone, $company")
    }
}

fun main() {
    val phoneNumbers: MutableList<Phone4> = mutableListOf()
    repeat(5) {
        val name = readln()
        val phone = readln().toLongOrNull()
        val company = readln().ifBlank { null }
        if (phone == null) {
            println("Номер не введен!")
        } else {
            phoneNumbers.add(Phone4(name, phone, company))
        }
    }
    phoneNumbers.forEach { it.report() }
}