package lesson_7

fun main() {

    do {
        var code = (1000..9999).random()
        println("Ваш код авторизации: $code")

        println("Введите четырехзначный код:")
        val userCode = readln().toInt()

        if (userCode == code) {
            println("Добро пожаловать!")
            break
        } else {
            println("Неверно. Генерируем новый код...")
        }
    } while (userCode != code)
}