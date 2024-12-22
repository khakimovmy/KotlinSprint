fun main() {

    val day: Int = 3

    val trainingDay: Boolean = day % 2 == 0

    print("""
       Упражнения для рук:    ${!trainingDay}
       Упражнения для ног:    $trainingDay
       Упражнения для спины:  $trainingDay
       Упражнения для пресса: ${!trainingDay}
    """.trimIndent())

}