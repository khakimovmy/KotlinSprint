fun main() {

    val day: Int = 3

    val workOut: Boolean = day % 2 == 0

    print("""
       Упражнения для рук:    ${!workOut}
       Упражнения для ног:    $workOut
       Упражнения для спины:  $workOut
       Упражнения для пресса: ${!workOut}
    """.trimIndent())

}