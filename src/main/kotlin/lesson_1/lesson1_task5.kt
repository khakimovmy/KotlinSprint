package lesson_1

fun main() {

    val totalSeconds: Int = 6480

    val hours: Int = totalSeconds / SECONDS_IN_HOUR
    val remainingSecondsAfterHours = totalSeconds % SECONDS_IN_HOUR
    val minutes: Int = remainingSecondsAfterHours / SECONDS_IN_MINUTE
    val seconds: Int = remainingSecondsAfterHours % SECONDS_IN_MINUTE

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println("Время, проведенное в космосе: $formattedTime")

}

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60