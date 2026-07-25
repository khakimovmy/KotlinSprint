package org.example.lesson_14

open class Liner(
    open val speed: Int = 70,
    open val payload: Int = 0,
    open val capacity: Int = 100
)

class Cargo : Liner() {
    override val speed = 30
    override val payload = 100
    override val capacity = 10
}

class Icebreaker : Liner() {
    override val speed = 30
    override val capacity = 10
    val canBreakIce = true
}

fun main() {
    val liner = Liner()
    val cargo = Cargo()
    val icebreaker = Icebreaker()
}