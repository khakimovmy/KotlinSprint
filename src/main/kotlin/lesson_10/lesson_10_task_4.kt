package org.example.lesson_10

fun main() {

    var wins = 0

    while (true) {
        val userNumber = randomDie()
        println("Вам выпало - $userNumber")
        val robotNumber = randomDie()
        println("Роботу выпало - $robotNumber")

        if (userNumber > robotNumber) {
            wins++
        }
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

fun randomDie(): Int { return (1..6).random() }