package org.example.lesson_17

class Package(val id: Int, currentLocation: String) {
    var moveCount = 0
        private set

    var currentLocation: String = currentLocation
        set(value) {
            field = value
            moveCount++
        }
}

fun main() {
    val package1 = Package(1, "Tashkent")
    package1.currentLocation = "Paris"
    package1.currentLocation = "Berlin"

    println(package1.moveCount)
}