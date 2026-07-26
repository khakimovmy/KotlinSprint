package org.example.lesson_15

abstract class ForumUser(val name: String) {
    fun read() {
        println("$name is reading")
    }

    fun write(text: String) {
        println("$name is writing: $text")
    }
}

class User(name: String) : ForumUser(name)

class Administrator(name: String) : ForumUser(name) {
    fun deleteMessage() {
        println("$name deleted message")
    }

    fun deleteUser(userName: String) {
        println("$name removed user $userName")
    }
}

fun main() {
    val user = User("Alex")
    user.read()
    user.write("Hello!")

    val admin = Administrator("Admin")
    admin.read()
    admin.write("I'm admin")
    admin.deleteUser("Nick")
    admin.deleteMessage()
}