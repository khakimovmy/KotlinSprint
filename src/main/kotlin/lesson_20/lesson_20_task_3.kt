package org.example.lesson_20

class Player(val hasKey: Boolean)

val openDoor: (Player) -> String = { player ->
    if (player.hasKey) "Игрок открыл дверь"
    else "Дверь заперта"
}

fun main() {
    val player1 = Player(false)
    val player2 = Player(true)

    println(openDoor(player1))
    println(openDoor(player2))
}