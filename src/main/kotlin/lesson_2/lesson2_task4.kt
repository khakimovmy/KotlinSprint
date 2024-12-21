package lesson_2

fun main() {

    val crystals = 7
    val iron = 11
    val buff = 20.0

    println("Было добыто $crystals кристаллической руды и $iron железной руды без баффа.")

    val buffedCrystals: Int = (crystals * (buff / 100)).toInt()
    val buffedIron: Int = (iron * (buff / 100)).toInt()

    println("Бонусные кристаллы - $buffedCrystals")
    println("Бонусное железо - $buffedIron")

    val totalCrystals = crystals + buffedCrystals
    val totalIron = iron + buffedIron

    println("Всего кристаллов: $totalCrystals")
    println("Всего железа: $totalIron")

}