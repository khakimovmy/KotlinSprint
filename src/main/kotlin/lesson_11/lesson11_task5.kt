package lesson_11

class Forum {
    private val users = mutableListOf<Member>()
    private val messages = mutableListOf<Message>()
    private var userIdCounter = 1

    fun createNewUser(userName: String): Member {
        val user = Member.Builder()
            .setUserId(userIdCounter++)
            .setUserName(userName)
            .build()
        users.add(user)
        return user
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (users.any { it.userId == authorId }) {
            val msg = Message.Builder()
                .setAuthorId(authorId)
                .setMessage(message)
                .build()
            messages.add(msg)
        } else {
            println("Ошибка: Пользователь с ID $authorId не найден.")
        }
    }

    fun printThread() {
        messages.forEach { msg ->
            val authorName = users.find { it.userId == msg.authorId }?.userName ?: "Неизвестный"
            println("$authorName: ${msg.message}")
        }
    }
}

class Member private constructor(val userId: Int, val userName: String) {
    class Builder {
        private var userId: Int = 0
        private lateinit var userName: String

        fun setUserId(id: Int) = apply { this.userId = id }
        fun setUserName(name: String) = apply { this.userName = name }
        fun build() = Member(userId, userName)
    }
}

class Message private constructor(val authorId: Int, val message: String) {
    class Builder {
        private var authorId: Int = 0
        private lateinit var message: String

        fun setAuthorId(id: Int) = apply { this.authorId = id }
        fun setMessage(msg: String) = apply { this.message = msg }
        fun build() = Message(authorId, message)
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Али")
    val user2 = forum.createNewUser("Борис")

    forum.createNewMessage(user1.userId, "Привет, это мое первое сообщение!")
    forum.createNewMessage(user1.userId, "Как дела?")
    forum.createNewMessage(user2.userId, "Привет, рад видеть тебя тут!")
    forum.createNewMessage(user2.userId, "Все отлично, спасибо!")

    forum.printThread()
}