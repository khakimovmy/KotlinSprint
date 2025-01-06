package lesson_6

fun main() {
    println("Пожалуйста, введите количество секунд:")
    var userTime = readln().toInt()
    val result = userTime

    while (userTime > 0) {
        println("Осталось секунд: ${userTime--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}