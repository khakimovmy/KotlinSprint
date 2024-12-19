fun main() {

    val weather: Boolean = true
    val tentNow: Boolean = true
    val airHumidity: Int = 20
    val seasonNow: String = "Summer"

    println("Благоприятные ли условия сейчас для роста бобовых? " + ((weather == SUNNY) && (tentNow == OPEN_TENT) && (airHumidity == AIR_HUMIDITY) && (seasonNow != SEASON)))

}

const val SUNNY = true
const val OPEN_TENT: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val SEASON = "Winter"