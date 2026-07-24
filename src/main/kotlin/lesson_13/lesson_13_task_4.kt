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
    while (true) {
        val name = readln()
        if (name.isEmpty()) break
        val phone = readln().toLongOrNull()
        if (phone == null) {
            println("Номер не введен!")
        } else {
            val company = readln().ifBlank { null }
            phoneNumbers.add(Phone4(name, phone, company))
        }
    }
    phoneNumbers.forEach { it.report() }
}