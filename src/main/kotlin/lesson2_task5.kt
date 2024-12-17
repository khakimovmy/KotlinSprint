import kotlin.math.pow

fun main() {

    val initialAmount: Double = 70_000.0 // Первоначальная сумма
    val totalAmount = initialAmount * (1 + ANNUAL_PERCENTAGE).pow(20)

    println("Размер вклада через $YEARS лет составляет: %.3f рублей".format(totalAmount))

}

const val YEARS: Int = 20 // Лет
const val ANNUAL_PERCENTAGE: Double = 16.7 / 100 // Годовая процентная ставка