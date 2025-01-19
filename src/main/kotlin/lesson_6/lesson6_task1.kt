package lesson_6

fun main() {
    println("Создать аккаунт")

    println("Создайте логин:")
    val login = readln()

    println("Создайте пароль:")
    val password = readln()

    var userLogin: String
    var userPassword: String

    do {
        println("Введите логин:")
        userLogin = readln()

        if (userLogin != login) {
            println("Логин не совпадает. Попробуйте снова!")
            continue
        }

        do {
            println("Введите пароль:")
            userPassword = readln()

            if (userPassword != password) {
                println("Пароль неверный. Попробуйте снова!")
            }
        } while (userPassword != password)

    } while (userLogin != login)
    println("Авторизация прошла успешно")
}