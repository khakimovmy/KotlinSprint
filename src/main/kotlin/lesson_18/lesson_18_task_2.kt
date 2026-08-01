package org.example.lesson_18

open class Dice(protected val sides: Int) {

    protected open fun message(result: Int): String {
        return "Выпало: $result"
    }

    fun throwDice() {
        val result = (1..sides).random()
        println(message(result))
    }
}

class Type4 : Dice(4) { override fun message(result: Int) = "Четырехгранная кость, выпало: $result" }
class Type6 : Dice(6) { override fun message(result: Int) = "Шестигранная кость, выпало: $result" }
class Type8 : Dice(8) { override fun message(result: Int) = "Восьмигранная кость, выпало: $result" }


fun main() {
    val dices: List<Dice> = listOf(Type4(), Type6(), Type8())
    for (dice in dices) {
        dice.throwDice()
    }
}