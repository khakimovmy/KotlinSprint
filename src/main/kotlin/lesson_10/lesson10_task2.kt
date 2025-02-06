package lesson_10

fun main() {
    println("Введите логин")
    val login = readln()

    println("Введите пароль")
    val password = readln()

    if (length(login) && length(password)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun length(input: String): Boolean {
    return input.length >= 4
}
