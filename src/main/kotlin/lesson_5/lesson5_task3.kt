package lesson_5

fun main() {

    val prizeNumber1 = 30
    val prizeNumber2 = 32

    println("Введите первое число от 0 до 42")
    val number1 = readln().toInt()

    println("Введите второе число от 0 до 42")
    val number2 = readln().toInt()

    val firstMatch = (number1 == prizeNumber1 || number1 == prizeNumber2)
    val secondMatch = (number2 == prizeNumber1 || number2 == prizeNumber2)

    val resultText = when {
        firstMatch && secondMatch -> "Поздравляем! Вы выиграли главный приз!"
        firstMatch || secondMatch -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }

    println(resultText)
    println("Для победы нужны были числа: $prizeNumber1 и $prizeNumber2")

}