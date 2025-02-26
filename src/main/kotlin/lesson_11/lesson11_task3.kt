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
    fun addUser() {
        println("Введите имя нового участника:")
        val newUserName = readln()
        val newUser = User(newUserName)
        users.add(newUser)
        println("${newUser.name} добавлен в комнату!")
    }

    fun updateStatus() {
        println("Введите имя участника, чье имя нужно изменить:")
        val userName = readln()
        val user = users.find { it.name == userName }

        if (user != null) {
            println("Введите новый статус (разговаривает / микрофон выключен / заглушен):")
            val newStatus = readln()
            user.status = newStatus
            println("Статус ${user.name} изменён на: $newStatus")
        } else {
            println("Пользователь не найден!")
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
    room1.addUser()
    room1.updateStatus()
    room1.displayRoomInfo()
}