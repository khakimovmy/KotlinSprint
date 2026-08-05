package org.example.lesson_21

data class Player(val name: String, val hp: Int, val maxHp: Int)

fun Player.isHealthy(): Boolean = hp == maxHp

fun main() {
    val player1 = Player("Kamila", 100, 100)
    val player2 = Player("Sadullayeva", 99, 100)
    println(player1.isHealthy())
    println(player2.isHealthy())
}