package org.example.lesson_16

class Player private constructor(
    val name: String,
    var power: Int,
    private var health: Int,
) {
    private var isAlive = true

    companion object {
        fun create(name: String, power: Int): Player {
            require(power >= 0) { "Power can't be negative" }
            return Player(name, power, 100)
        }
    }

    private fun dying() {
        power = 0
        health = 0
        println("$name is dead.")
        isAlive = false
    }

    fun getDamage(damage: Int) {
        if (!isAlive) return println("$name is dead")
        health -= damage
        if (health <= 0) dying()
        else println("$name got $damage damage. HP: $health")
    }

    fun getCure(cure: Int) {
        if (!isAlive) return println("$name is dead")
        health += cure
        println("$name got $cure cure. HP: $health")
    }
}

fun main() {
    val player1 = Player.create("Steve", 100)
    val player2 = Player.create("Eve", 100)

    player1.getDamage(25)
    player2.getDamage(10)

    player1.getCure(15)
    player2.getCure(10)

    player1.getDamage(90)
    player2.getDamage(200)
}