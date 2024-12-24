package lesson_4

fun main() {

    val day: Int = 3

    val workOutDay: Boolean = day % 2 == 0

    print("""
       Упражнения для рук:    ${!workOutDay}
       Упражнения для ног:    $workOutDay
       Упражнения для спины:  $workOutDay
       Упражнения для пресса: ${!workOutDay}
    """.trimIndent())

}