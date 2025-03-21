package lesson_13

class UserInfo3(
    val name: String,
    val phone: Long,
    val company: String? = null
) {
    fun printUserInfo() {
        println("Имя: $name, Номер: $phone, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val user3 = listOf(
        UserInfo3("Ali", 12689452L, "IBM"),
        UserInfo3("Bob", 45892345L, "null"),
        UserInfo3("Rob", 34869823L, null),
        UserInfo3("John", 84629023L, "Meta"),
        UserInfo3("Bro", 92856349L, null),
    )
    user3.forEach {
        println("Имя: ${it.name}, Номер: ${it.phone}, Компания: ${it.company ?: "<не указано>"}")
    }

    val companies = user3.mapNotNull { it.company }
    println("Существующие компании: $companies")
}