package lesson_5

import kotlin.math.pow

fun main() {

    println("Введите массу вашего тела (в килограммах)")
    val userWeight = readln().toDouble()

    println("Введите ваш рост (в сантиметрах)")
    val userHeightCm = readln().toDouble()

    val userHeight = userHeightCm / 100

    val BMI = userWeight / userHeight.pow(2)

    when {
        BMI < 18.5 -> println("Недостаточная масса тела")
        BMI >= 18.5 && BMI < 25 -> println("Нормальная масса тела")
        BMI >= 25 && BMI < 30 -> println("Избыточная масса тела")
        BMI >= 30 -> println("Ожирение")
    }

    println("Ваш ИМТ: %.2f".format(BMI))

}