package org.example.lesson_17

class Ship(name: String, val averageSpeed: Int, val port: String) {
    var name: String = name
        set(value) {
            println("Нельзя менять имя!")
        }
}

fun main() {
    val ship1 = Ship("Dilbar", 170, "Saeed")
    ship1.name = "Aurora"
}