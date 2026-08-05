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
        "Альфа Центавра",
        "Это тройная звёздная система, расположенная в созвездии Центавра",
        LocalDateTime.of(1952, 4, 23, 11, 40),
        4.37
    )

    val (name, description, date, distance) = alphaCentauri
    println("$name, $description, $date, $distance")
}