package lesson_10

fun main() {
    var userWins = 0

    while (true) {
        val roundResult = playRound()
        if (roundResult) userWins++

        println("Хотите бросить кости еще раз? Введите Да или Нет: ")
        val answer = readln()?.trim()?.lowercase()
        if (answer != "да") break
    }
    println("Игра окончена. Вы выиграли $userWins раз(а).")
}

fun randomDice(): Int = (1..6).random()

fun playRound(): Boolean {
    val user = randomDice()
    val robot = randomDice()

    println("Твоя очередь! Ты бросил $user")
    println("Очередь робота! Робот бросил $robot")

    return when {
        user > robot -> {
            println("Победило человечество")
            true
        }
        user == robot -> {
            println("Ничья!")
            false
        }
        else -> {
            println("Победила машина!")
            false
        }
    }
}