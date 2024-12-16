package lesson_1

fun main() {
    // Количество секунд, проведенных Гагариным в космосе
    val totalSeconds: Int = 6480

    // Расчет времени
    val hours: Int = totalSeconds / 3600
    val remainingSecondsAfterHours = totalSeconds % 3600
    val minutes: Int = remainingSecondsAfterHours / 60
    val seconds: Int = remainingSecondsAfterHours % 60

    // Форматированный вывод с двумя цифрами
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println("Время, проведенное в космосе: $formattedTime")
}
