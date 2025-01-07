package lesson_8

fun main() {
    val arrayOfViews: IntArray = intArrayOf(15, 25, 10, 30, 50, 40, 35)

    println("Количество просмотров за каждый день: ${arrayOfViews.joinToString(", ")}")

    val totalViews = arrayOfViews.sum()
    println("Общее количество просмотров за неделю: $totalViews")
}