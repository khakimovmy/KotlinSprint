package lesson_3

fun main() {

    val yourNumber: Int = 6

    val multiply = """
        $yourNumber * 1 = ${yourNumber * 1}
        $yourNumber * 2 = ${yourNumber * 2}
        $yourNumber * 3 = ${yourNumber * 3}
        $yourNumber * 4 = ${yourNumber * 4}
        $yourNumber * 5 = ${yourNumber * 5}
        $yourNumber * 6 = ${yourNumber * 6}
        $yourNumber * 7 = ${yourNumber * 7}
        $yourNumber * 8 = ${yourNumber * 8}
        $yourNumber * 9 = ${yourNumber * 9}
        $yourNumber * 10 = ${yourNumber * 10}
    """.trimIndent()

    println("Вот таблица умножения числа: $yourNumber \n$multiply")

}