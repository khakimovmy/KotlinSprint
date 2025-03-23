package lesson_14

open class Ships(
    val fastSpeed: Boolean? = null,
    val moreLoadCapacity: Boolean? = null,
    val canCrushIce: Boolean? = null,
)

class Liner : Ships(
    moreLoadCapacity = true
)

class Cargo : Ships(
    fastSpeed = false,
    moreLoadCapacity = true
)

class Icebreaker : Ships(
    fastSpeed = false,
    moreLoadCapacity = false,
    canCrushIce = true
)

fun main() {

    val liner = Liner()
    val cargo = Cargo()
    val icebreaker = Icebreaker()

    println("Лайнер: \nБольшая вместительность: ${liner.moreLoadCapacity}\n")
    println("Грузовой: \nБольшая скорость: ${cargo.fastSpeed}\nГрузоподъемность: ${cargo.moreLoadCapacity}\n")
    println(
        "Ледокол: \nБольшая скорость: ${icebreaker.fastSpeed}\nБольшая вместительность: " +
                "${icebreaker.moreLoadCapacity}\nМожет колоть лёд: ${icebreaker.canCrushIce}"
    )
}