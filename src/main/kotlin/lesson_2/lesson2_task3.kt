package lesson_2

fun main() {
    val departureHour = 9  // Часы отправления
    val departureMinute = 39  // Минуты отправления
    val onTheWayTime = 457  // Время в пути

    val totalMinutes = departureHour * MINUTES_IN_HOUR + departureMinute + onTheWayTime
    val comingHour = totalMinutes / MINUTES_IN_HOUR
    val comingMinute = totalMinutes % MINUTES_IN_HOUR

    println("Поезд прибудет в $comingHour:$comingMinute")
}

const val MINUTES_IN_HOUR = 60  //  Минут в часе
