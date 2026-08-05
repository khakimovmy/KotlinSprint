package org.example.lesson_21

data class Player21(val name: String, val hp: Int, val maxHp: Int)

fun Player21.isHealthy(): Boolean = hp == maxHp

fun main() {
    val player1 = Player21("Kamila", 100, 100)
    println(player1.isHealthy())
}