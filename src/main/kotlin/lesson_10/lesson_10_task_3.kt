package org.example.lesson_10

fun main() {

    println("Введите длину пароля:")
    println(generatePassword(readln().toInt()))

}

fun generatePassword(length: Int): String {
    val symbols = "!\"#\$%&'()*+,-./ "
    val digits = (0..9)
    var password = ""

    for (i in 1..length) {
        if (i % 2 == 0) {
            password += symbols.random()
        } else {
            password += digits.random()
        }
    }
    return password
}