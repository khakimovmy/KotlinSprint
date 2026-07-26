package org.example.lesson_15

interface FlyingAnimal {
    fun fly()
}

interface SwimmingAnimal {
    fun swim()
}

class CrucianCarp : SwimmingAnimal {
    override fun swim() {
        println("Карась плавает")
    }
}

class Gull : FlyingAnimal {
    override fun fly() {
        println("Чайка летает")
    }
}

class Duck : FlyingAnimal, SwimmingAnimal {
    override fun fly() {
        println("Утка летает")
    }

    override fun swim() {
        println("Утка плавает")
    }
}

fun main() {
    val crucianCarp = CrucianCarp()
    crucianCarp.swim()

    val gull = Gull()
    gull.fly()

    val duck = Duck()
    duck.fly()
    duck.swim()
}