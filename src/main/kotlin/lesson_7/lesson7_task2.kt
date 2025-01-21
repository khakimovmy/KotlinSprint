package lesson_7

fun main() {
    var code = (1000..9999).random()
    println("Ваш код авторизации: $code")

    do {
        println("Введите четырехзначный код:")
        val userCode = readln().toInt()

        if (userCode == code) {
            println("Добро пожаловать!")
            break
        } else {
            println("Неверно. Генерируем новый код...")
            code = (1000..9999).random()
            println("Ваш новый код авторизации: $code")
        }
    } while (userCode != code)
}