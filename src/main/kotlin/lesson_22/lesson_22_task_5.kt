package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val locationName: String,
    val locationDescription: String,
    val dateAndTime: LocalDateTime,
    val distanceFromEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        locationName = "Альфа Центавра",
        locationDescription = "Это тройная звёздная система, расположенная в созвездии Центавра",
        dateAndTime = LocalDateTime.of(1952, 4, 23, 11, 40),
        distanceFromEarth = 4.37
    )

    println(alphaCentauri.component1())
    println(alphaCentauri.component2())
    println(alphaCentauri.component3())
    println(alphaCentauri.component4())
}