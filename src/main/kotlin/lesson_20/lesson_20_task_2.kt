package org.example.lesson_20

class Player1(val name: String, var health: Int, val maxHealth: Int)

val heal: (Player1) -> Unit = { player -> player.health = player.maxHealth}

fun main() {
    val player1 = Player1("Alex", 50, 100)
    println(player1.health)
    heal(player1)
    println(player1.health)
}