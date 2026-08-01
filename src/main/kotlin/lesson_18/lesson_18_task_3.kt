package org.example.lesson_18

abstract class Tamagotchi(val name: String) {
    protected open val food = "еда"

    fun eat() { println("$name -> ест $food") }
    fun sleep() { println("$name -> спит") }
}

class Fox(name: String) : Tamagotchi(name) { override val food = "ягоды" }
class Cat(name: String) : Tamagotchi(name) { override val food = "рыбу" }
class Dog(name: String) : Tamagotchi(name) { override val food = "кости" }

fun main() {
    val pets: List<Tamagotchi> = listOf(
        Fox("Лиса"),
        Cat("Кошка"),
        Dog("Собака")
    )

    for (pet in pets) {
        pet.eat()
    }
}