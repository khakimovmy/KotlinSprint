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
    private var userId = 0
    private val users: MutableList<ForumMember> = mutableListOf()
    private val messages: MutableList<ForumMessage> = mutableListOf()

    class ForumMemberBuilder() {
        private var id: Int = 0
        private var name: String = ""

        fun setId(id: Int) = apply { this.id = id }
        fun setName(name: String) = apply { this.name = name }
        fun build() = ForumMember(id, name)
    }

    class ForumMessageBuilder() {
        private var authorId: Int = 0
        private var message: String = ""

        fun setAuthorId(id: Int) = apply { this.authorId = id }
        fun setMessage(msg: String) = apply { this.message = msg }
        fun build() = ForumMessage(authorId, message)
    }

    fun createNewUser(name: String): ForumMember {
        val newUser = ForumMemberBuilder()
            .setId(userId)
            .setName(name)
            .build()
        users.add(newUser)
        userId++
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        val userExists = users.any { it.userId == authorId }
        if (userExists) {
            val newMessage = ForumMessageBuilder()
                .setAuthorId(authorId)
                .setMessage(message)
                .build()
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