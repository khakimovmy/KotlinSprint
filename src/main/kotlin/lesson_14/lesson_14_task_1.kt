package org.example.lesson_14

open class Liner(
    val speed: Int = 70,
    val payload: Int = 0,
    val capacity: Int = 100
)

class Cargo(
    speed: Int,
    payload: Int,
    capacity: Int
) : Liner(speed, payload, capacity)

class Icebreaker(
    speed: Int,
    payload: Int,
    capacity: Int,
    val icebreaker: Boolean
) : Liner(speed, payload, capacity)

fun main() {
    val liner = Liner()
    val cargo = Cargo(30, 100, 10)
    val iceBreaker = Icebreaker(30, 0, 10, true)
}