package org.example.lesson_19

enum class Fish(val title: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок"),
}

fun main() {
    println("Можете добавить в аквариум:")
    Fish.entries.forEach { println(it.title) }
}