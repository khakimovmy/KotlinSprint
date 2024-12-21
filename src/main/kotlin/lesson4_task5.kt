fun main() {

    val shipDamages = true
    val shipCrew = 55
    val provision = 53
    val goodWeather = false
//    val badWeather = true

    val shipCan = (!shipDamages && shipCrew in MIN_CREW..MAX_CREW && provision > MIN_PROVISION) ||
            (shipDamages && shipCrew == RECOMMENDED_CREW && goodWeather && provision >= MIN_PROVISION)

    println("Ship can go: $shipCan")

}

const val MIN_CREW: Int = 55
const val MAX_CREW: Int = 70
const val MIN_PROVISION: Int = 50
const val RECOMMENDED_CREW: Int = 70