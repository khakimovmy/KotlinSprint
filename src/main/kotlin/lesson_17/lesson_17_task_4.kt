package org.example.lesson_17

class Package(val id: Int, currentLocation: String) {
    private var _moveCount = 0
    val moveCount: Int get() = _moveCount

    var currentLocation: String = currentLocation
        set(value) {
            field = value
            _moveCount++
        }
}

fun main() {
    val package1 = Package(1, "Tashkent")
    package1.currentLocation = "Paris"
    package1.currentLocation = "Berlin"

    println(package1.moveCount)
}