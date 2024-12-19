fun main() {

    val todayBooked: Int = 13
    val tomorrowBooked: Int = 9

    val todayFree: Boolean = TOTAL_TABLES > todayBooked
    val tomorrowFree: Boolean = TOTAL_TABLES > tomorrowBooked

    println("Доступность столиков на сегодня: $todayFree \nДоступность столиков на завтра: $tomorrowFree")

}

const val TOTAL_TABLES: Int = 13