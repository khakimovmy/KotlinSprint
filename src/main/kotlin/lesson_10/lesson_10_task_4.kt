package org.example.lesson_10

fun main() {

    var wins = 0

    while (true) {
        if (playRound() == 1) wins++
        println("Хотите бросить кости еще раз? Введите Да или Нет?")
        val answer = readln().lowercase()
        if (answer == "да") {
            continue
        } else {
            println("Выигранных партий: $wins")
            return
        }
    }

}

fun rollDice(sides: Int = 6): Int = (1..sides).random()

fun playRound(): Int {
    val userNumber = rollDice(sides = 6)
    println("Вам выпало - $userNumber")
    val robotNumber = rollDice(sides = 6)
    println("Роботу выпало - $robotNumber")

    return if (userNumber > robotNumber) 1 else 0
}