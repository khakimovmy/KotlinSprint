fun main() {
    val generatedPassword = generatePassword()
    println("Сгенерированный пароль: $generatedPassword")
}

fun generatePassword(): String {
    val password = StringBuilder()

    for (i in 1..PASSWORD_SIZE) {
        if (i % 2 == 0) {
            password.append((0..9).random()) // Используем диапазон и random()
        } else {
            password.append(('a'..'z').random()) // Аналогично для букв
        }
    }
    return password.toString()
}

const val PASSWORD_SIZE: Int = 6