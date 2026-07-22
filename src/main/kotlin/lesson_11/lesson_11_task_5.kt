package org.example.lesson_11

data class ForumMember(
    val userId: Int,
    var userName: String,
)

data class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum() {
    var userId = 0
    val users: MutableList<ForumMember> = mutableListOf()
    val messages: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(name: String): ForumMember {
        val newUser = ForumMember(userId, name)
        users.add(newUser)
        userId++
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        val userExists = users.any { it.userId == authorId }
        if (userExists) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
            return newMessage
        } else {
            return null
        }
    }

    fun printThread() {
        messages.forEach { message ->
            val author = users.find { it.userId == message.authorId }
            println("${author?.userName}: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()
    val anna= forum.createNewUser("Anna")
    val boris = forum.createNewUser("Boris")
    forum.createNewMessage(anna.userId, "Hello this is Anna")
    forum.createNewMessage(anna.userId, "This is my second message!")
    forum.createNewMessage(boris.userId, "Hello this is Boris")
    forum.createNewMessage(boris.userId, "This is my second message, too")
    forum.printThread()
}