fun main() {

    val day: Int = 3

    val armAndAbs: Boolean = day % 2 != 0
    val legAndBack: Boolean = day % 2 == 0

    print("""
       Упражнения для рук:    $armAndAbs
       Упражнения для ног:    $legAndBack
       Упражнения для спины:  $legAndBack
       Упражнения для пресса: $armAndAbs
    """.trimIndent())

}