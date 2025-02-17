package lesson_10

val products = listOf("tomato", "potato", "sugar")

fun main() {
    println("Введите логин:")
    val userLogin = readln()?.trim()
    println("Введите пароль:")
    val userPassword = readln()?.trim()

    val token = authorize(userLogin, userPassword)

    if (token != null) {
        println("Авторизация успешна! Ваш токен: $token")

        val userCart = getCart(token)
        println("Ваша корзина: $userCart")
    } else {
        println("Ошибка: Неверные логин или пароль.")
    }
}

fun authorize(login: String?, password: String?): String? {
    return if (login == LOGIN && password == PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    return (1..TOKEN_SIZE).map { chars.random() }.joinToString("")
}

fun getCart(token: String?): List<String>? {
    return if (token != null) products else null
}

const val TOKEN_SIZE: Int = 32
const val LOGIN = "Kotlin"
const val PASSWORD = "IDEA1234"