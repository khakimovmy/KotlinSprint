package org.example.lesson_15

abstract class Product(val name: String, val amount: Int)

interface Search {
    fun searchComponent(name: String)
}

class Instrument(instrumentName: String, amount: Int) : Product(instrumentName, amount), Search {
    override fun searchComponent(name: String) {
        println("Выполняется поиск комплектующих для $name")
    }
}

class Component(name: String, amount: Int) : Product(name, amount)

fun main() {
    val instrument1 = Instrument("Guitar", 2)
    val component1 = Component("Strings", 6)

    instrument1.searchComponent(instrument1.name)
    println("${component1.name}: ${component1.amount} pcs.")
}