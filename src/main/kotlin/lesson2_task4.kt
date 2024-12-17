fun main() {

    val crystals = 7
    val iron = 11

    println("Было добыто $crystals кристаллической руды и $iron железной руды без баффа.")

    val buffedCrystals: Int = (crystals * (BUFF / 100)).toInt()
    val buffedIron: Int = (iron * (BUFF / 100)).toInt()

    println("Бонусные кристаллы - $buffedCrystals")
    println("Бонусное железо - $buffedIron")

    val totalCrystals = crystals + buffedCrystals
    val totalIron = iron + buffedIron

    println("Всего кристаллов: $totalCrystals")
    println("Всего железа: $totalIron")

}

const val BUFF = 20.0