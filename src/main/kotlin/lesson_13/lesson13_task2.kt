package lesson_13

class UserInfo2(
    val name: String,
    val phone: Long,
    val company: String? = null
) {
    fun printUserInfo(){
        println("Имя: $name, Номер: $phone, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val user2 = UserInfo2("Abbos", 1234567890L, null)
    user2.printUserInfo()
}