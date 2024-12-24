package lesson_4

fun main() {

    val shipDamages = true
    val shipCrew = 55
    val provision = 53
    val goodWeather = false

    val shipCan = (shipDamages == SHIP_DAMAGES && shipCrew in MIN_CREW..MAX_CREW && provision > MIN_PROVISION) ||
            (shipDamages != SHIP_DAMAGES && shipCrew == RECOMMENDED_CREW && goodWeather == GOOD_WEATHER && provision >= MIN_PROVISION)

    println("Ship can go: $shipCan")

}

const val MIN_CREW: Int = 55
const val MAX_CREW: Int = 70
const val MIN_PROVISION: Int = 50
const val RECOMMENDED_CREW: Int = 70
const val SHIP_DAMAGES: Boolean = false
const val GOOD_WEATHER: Boolean = true
