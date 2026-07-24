package org.example.lesson_13

class Phone5(
    val name: String,
    val phone: Long,
    val company: String? = null,
) {
    fun report() {
        println("$name, $phone, $company")
    }
}

fun main() {
    try {
        val input = readln().toLong()
        println(input)
    } catch (e: NumberFormatException) {
        println(e::class.simpleName)
    }
}