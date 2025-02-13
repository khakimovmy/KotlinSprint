package lesson_10

fun main() {
    println("Введите длину пароля:")
    println("Сгенерированный пароль: ${passwordGenerator()}")
}

fun passwordGenerator(): String {
    val password = StringBuilder()
    for (i in 1..passwordLength()) {
        if (i % 2 == 0) {
            val specialChars = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '/', '-', '.', '/')
            password.append(specialChars.random())
        } else {
            password.append((0..9).random())
        }
    }
    return password.toString()
}

fun passwordLength(): Int {
    val length = readln().toInt()
    return length
}