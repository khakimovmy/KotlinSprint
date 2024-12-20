fun main() {

    val shipDamages = true
    val shipCrew = 55
    val provision = 53
    val goodWeather = false
    val badWeather = true

    val shipCan = ((shipDamages == true) && (shipCrew >= MIN_CREW) && (shipCrew <= MAX_CREW)
            && (provision > PROVISION) && ((goodWeather == true)) || (badWeather == true)) ||
            (shipCrew == RECOMMENDED_CREW) && (goodWeather == true) && (provision >= PROVISION)
    println("Ship can go: $shipCan")

}

const val MIN_CREW: Int = 55
const val MAX_CREW: Int = 70
const val PROVISION: Int = 50
const val RECOMMENDED_CREW: Int = 70