package org.example.lesson_20

class Player(val name: String, var health: Int, val maxHealth: Int)

val heal: (Player) -> Unit = { player -> player.health = player.maxHealth}

fun main() {
    val player1 = Player("Alex", 50, 100)
    println(player1.health)
    heal(player1)
    println(player1.health)
}