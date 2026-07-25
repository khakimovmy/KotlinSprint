package org.example.lesson_14

open class Liner2(
    open val speed: Int = 70,
    open val payload: Int = 0,
    open val capacity: Int = 100
) {
    open fun getInfo() {
        println("$speed, $payload, $capacity")
    }

    open fun load() {
        println("лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class Cargo2 : Liner2() {
    override val speed = 30
    override val payload = 100
    override val capacity = 10

    override fun getInfo() {
        println("$speed, $payload, $capacity")
    }

    override fun load() {
        println("грузовой корабль активирует погрузочный кран")
    }
}

class Icebreaker2 : Liner2() {
    override val speed = 30
    override val capacity = 10
    val canBreakIce = true

    override fun getInfo() {
        println("$speed, $payload, $capacity $canBreakIce")
    }

    override fun load() {
        println("ледокол открывает ворота со стороны кормы.")
    }
}

fun main() {
    val liner = Liner2()
    val cargo = Cargo2()
    val icebreaker = Icebreaker2()

    liner.getInfo()
    liner.load()
    cargo.getInfo()
    cargo.load()
    icebreaker.getInfo()
    icebreaker.load()
}