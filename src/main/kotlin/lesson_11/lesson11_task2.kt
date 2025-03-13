package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String,
) {
    fun userInfo() {
        println("Информация о пользователе:")
        println("ID: $id")
        println("Логин: $login")
        println("Пароль: $password")
        println("Почта: $email")
        println("Био: $bio")
    }

    fun userBio() {
        println("Enter bio:")
        bio = readln()
    }

    fun changePassword() {
        println("Изменение пароля")

        while (true) {
            println("Введите текущий пароль:")
            val currentPassword = readln()

            if (currentPassword == password) {
                println("Введите новый пароль:")
                password = readln()
                println("Пароль успешно изменен!")
                break
            } else {
                println("Неверно!")
            }
        }
    }
}

fun main() {
    val user = User2(248709, "abba", "1234", "email@gmail.com", "Marketing specialist")
    user.userInfo()
    user.userBio()
    user.changePassword()
    user.userInfo()
}