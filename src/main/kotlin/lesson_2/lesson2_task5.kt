package lesson_2

import kotlin.math.pow

fun main() {

    val initialAmount: Double = 70_000.0 // Первоначальная сумма
    val years: Int = 20 // Лет
    val annualPercentage: Double = 16.7 / 100 // Годовая процентная ставка
    val totalAmount = initialAmount * (1 + annualPercentage).pow(years)

    println("Размер вклада через $years лет составляет: %.3f рублей".format(totalAmount))

}