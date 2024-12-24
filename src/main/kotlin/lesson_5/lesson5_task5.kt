package lesson_5

fun main() {

    val winningNumbers = List(3) { (0..42).random() }

    println("Введите три числа от 0 до 42:")

    val userNumbers = mutableListOf<Int>()

    repeat(3) {
        println("Введите число ${it + 1}:")
        userNumbers.add(readln().toInt())
    }

    val matches = userNumbers.intersect(winningNumbers).size

    when (matches) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число. Вам выплачивается утешительный приз!")
        0 -> println("К сожалению, вы не угадали ни одного числа :(")
    }

    println("Выигрышными числами были: $winningNumbers")

}
