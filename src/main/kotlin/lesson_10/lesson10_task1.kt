package lesson_10

fun main() {
    callingUser()
    callingRobot()

    if (userDice() > robotDice()) {
        println("Победило человечество")
    } else if (userDice() == robotDice()) {
        println("Победила дружба")
    } else {
        println("Победила машина")
    }
}

fun callingUser() {
    println("Твоя очередь! Бросай кости")
    println("Число человека - ${userDice()}")
}
fun callingRobot() {
    println("Очередь робота! Бросай кости")
    println("Число робота - ${robotDice()}")
}

fun userDice(): Int = (1..6).random()
fun robotDice(): Int = (1..6).random()