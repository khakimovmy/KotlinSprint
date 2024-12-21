package lesson_5

fun main() {

    val number1 = 2
    val number2 = 3

    println("Решите пример: $number1 + $number2")

    val answer = readln().toInt()

    if (answer == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }

}