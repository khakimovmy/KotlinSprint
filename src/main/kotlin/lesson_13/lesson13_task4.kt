package lesson_13

class UserInfo4(
    val name: String,
    val phone: Long,
    val company: String? = null
) {
    fun printUserInfo() {
        println("Имя: $name, Номер: $phone, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contacts = mutableListOf<UserInfo4>()

    while (true) {
        println("Введите имя контакты: ")
        val name = readlnOrNull() ?: continue

        println("Введите номер телефона:")
        val phoneInput = readlnOrNull()
        val phoneNumber = phoneInput?.toLongOrNull()

        if (phoneNumber == null) {
            println("Номер телефона не введён или введён некорректно. Запись не добавлена.")
            continue
        }
        println("Введите название компании (или оставьте пустым):")
        val company = readlnOrNull()?.takeIf { it.isNotBlank() } // Если пусто, то null

        // Создаём объект Contact2 и добавляем его в список
        val contact = UserInfo4(name, phoneNumber, company)
        contacts.add(contact)

        println("Контакт добавлен!")
    }
    println("\nСписок контактов:")
    contacts.forEach { it.printUserInfo() }
}