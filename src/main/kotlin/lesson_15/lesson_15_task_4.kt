package org.example.lesson_15

abstract class Product(val name: String, val amount: Int)

interface Search {
    fun searchComponent()
}

class Instrument(name: String, amount: Int) : Product(name, amount), Search {
    override fun searchComponent() {
        println("Выполняется поиск комплектующих для $name")
    }
}

class Component(name: String, amount: Int) : Product(name, amount)

fun main() {
    val instrument1 = Instrument("Guitar", 2)
    val component1 = Component("Strings", 6)

    instrument1.searchComponent()
    println("${component1.name}: ${component1.amount} pcs.")
}