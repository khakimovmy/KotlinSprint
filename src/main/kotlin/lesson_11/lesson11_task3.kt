package lesson_11

class User(
    val name: String,
    var status: String = "микрофон выключен",
)

class Room(
    val thumbnail: String,
    val name: String,
    val users: MutableList<User>
) {
    fun addUser(userName: String) {
        val newUser = User(userName)
        users.add(newUser)
        println("${newUser.name} добавлен в комнату $name")
    }

    fun updateStatus(userName: String, newStatus: String) {
        val user = users.find { it.name == userName }
        if (user != null) {
            user.status = newStatus
            println("Статус ${user.name} изменён на: $newStatus")
        } else {
            println("Пользователь $userName не найден!")
        }
    }

    fun displayRoomInfo() {
        println("Комната: $name")
        println("Обложка: $thumbnail")
        println("Участники:")
        users.forEach { println(" - ${it.name} (${it.status})") }
    }
}

fun main() {
    val room1 = Room(
        thumbnail = "Обложка №1",
        name = "Название комнаты №1",
        users = mutableListOf(
            User("Стив", "разговаривает"),
            User("Алекс", "микрофон выключен")
        )
    )

    room1.displayRoomInfo()
    room1.addUser("Лола")
    room1.updateStatus("Алекс", "Заглушен")
    room1.displayRoomInfo()
}