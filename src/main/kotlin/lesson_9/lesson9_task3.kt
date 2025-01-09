package lesson_9

fun main() {
    val ingredients = mutableListOf(4, 1, 3, 2)

    println("Введите количество порций:")
    val portion = readln().toInt()

    val totalEggs = ingredients[0] * portion
    val totalMilk = ingredients[1] * portion
    val totalButter = ingredients[2] * portion
    val totalSalt = ingredients[3] * portion

    println(
        "На $portion порций вам понадобится: Яиц – $totalEggs шт., молока – $totalMilk мл," +
                "сливочного масла – $totalButter гр., соли – $totalButter гр."
    )
}