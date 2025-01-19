package lesson_6

fun main() {
    println("Пожалуйста, введите количество секунд:")
    var userTime = readln().toInt()

    Thread.sleep(userTime * 1000L)
    println("Прошло $userTime секунд")
}