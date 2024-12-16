fun main() {

    val totalMinutes = DEPARTURE_HOUR * 60 + DEPARTURE_MINUTE + ON_THE_WAY_TIME
    val comingHour = totalMinutes / 60
    val comingMinute = totalMinutes % 60

    println("Поезд прибудет в: $comingHour:$comingMinute")

}

const val DEPARTURE_HOUR: Int = 9
const val DEPARTURE_MINUTE: Int = 39
const val ON_THE_WAY_TIME: Int = 457