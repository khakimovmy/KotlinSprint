package org.example.lesson_11


class Room(
    val cover: String,
    val name: String,
    val users: MutableList<User>,
) {
    fun addUser(user: User) {
        users.add(user)
    }

    fun updateStatus(userName: String, newStatus: String) {
        for (user in users) {
            if (user.userName == userName) user.status = newStatus
        }
    }

    class User(
        val avatar: String,
        val userName: String,
        var status: String = "разговаривает",
    )
}

fun main() {
    val room1: Room = Room(
        "main_cover.png",
        "Red Rock",
        mutableListOf(),
    )
}