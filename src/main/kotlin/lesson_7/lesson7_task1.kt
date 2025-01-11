package lesson_7

import java.lang.StringBuilder
import kotlin.random.Random

fun main() {
    val generatedPassword = generatePassword()
    println("Сгенерированный пароль: $generatedPassword")
}

fun generatePassword(): String {
    val password = StringBuilder()

    for (i in 1..6) {
        if (i % 2 == 0) {
            password.append(Random.nextInt(0,10))
        } else {
            password.append(('a'..'z').random())
        }
    }
    return password.toString()
}