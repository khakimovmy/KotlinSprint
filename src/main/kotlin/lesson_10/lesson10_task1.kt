package lesson_10

fun main() {
    val userResult = rollDice()
    val robotResult = rollDice()

    callingUser(userResult)
    callingRobot(robotResult)

    when {
        userResult > robotResult -> println("Победило человечество")
        userResult == robotResult -> println("Победила дружба")
        else -> println("Победила машина")
    }
}

fun callingUser(result: Int) {
    println("Твоя очередь! Бросай кости")
    println("Число человека: $result")
}

fun callingRobot(result: Int) {
    println("Очередь робота")
    println("Число робота: $result")
}

fun rollDice(): Int = (1..6).random()