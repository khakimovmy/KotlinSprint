package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val atmosphere: Boolean,
    val canLand: Boolean,
)

class Planet(
    name: String,
    atmosphere: Boolean,
    canLand: Boolean,
    val satellites: List<Satellite>,
) : CelestialBody(name, atmosphere, canLand)

class Satellite(
    name: String,
    atmosphere: Boolean,
    canLand: Boolean,
) : CelestialBody(name, atmosphere, canLand)

fun main() {
    val moon = Satellite("Луна", false, true)
    val europa = Satellite("Европа", true, false)
    val earth = Planet("Земля", true, true, listOf(moon, europa))

    println(earth.name)
    earth.satellites.forEach { println(it.name) }
}