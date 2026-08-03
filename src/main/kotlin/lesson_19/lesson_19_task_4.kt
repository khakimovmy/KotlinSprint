package org.example.lesson_19

enum class Patron(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    var currentPatron: Patron? = null

    fun reload(patron: Patron) {
        currentPatron = patron
    }

    fun shoot() {
        val patron = currentPatron
        if (patron == null) {
            println("Нет патрона")
            return
        }
        println("Нанесено ${patron.damage} урона")
    }
}

fun main() {
    val tank1 = Tank()
    tank1.reload(Patron.BLUE)
    tank1.shoot()

    tank1.reload(Patron.GREEN)
    tank1.shoot()

    tank1.reload(Patron.RED)
    tank1.shoot()
}