fun main() {

    val crystals = 7
    val iron = 11

    println("Было добыто $crystals кристаллической руды и $iron железной руды без баффа.")

    val buffedCrystals: Int = (crystals * (BUFF / 100)).toInt()
    val buffedIron: Int = (iron * (BUFF / 100)).toInt()

    println("Бонусные кристаллы - $buffedCrystals")
    println("Бонусное железо - $buffedIron")

}

const val BUFF = 20.0