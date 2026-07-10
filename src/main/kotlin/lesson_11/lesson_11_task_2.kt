package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null
) {

    fun printUserInfo() {
        println("ID: $id\nLogin: $login\nPassword: hidden\nEmail: $email\nBio: $bio")
    }

    fun bioUpdate() {
        println("Enter bio:")
        bio = readln()
    }

    fun changePassword() {
        println("Enter current password:")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Enter a new password:")
            val newPassword = readln()
            password = newPassword
            println("Password changed!")
        } else {
            println("Wrong password!")
        }
    }
}

fun main() {
    val user1: User2 = User2(
        1,
        "pirate",
        "crawl777",
        "a@mail.ru",
    )
    user1.bioUpdate()
    user1.changePassword()
    user1.printUserInfo()

}
