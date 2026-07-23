package org.example.lesson_13

class Phone3(
    val name: String,
    val phone: Long,
    val company: String? = null,
)

fun main() {
    val contacts = listOf(
        Phone3("Anna", 198631, null),
        Phone3("Boris", 586320, null),
        Phone3("Alex", 976388, "null"),
        Phone3("Timur", 730159, "Google"),
        Phone3("Phil", 603658, "Microsoft")
    )

    val companies = contacts.mapNotNull { it.company }
    println(companies.joinToString())
}