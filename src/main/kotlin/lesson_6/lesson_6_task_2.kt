package org.example.lesson_6

fun main() {

    println("Введите количество секунд:")
    var seconds = readln().toInt()
    val total = seconds

    while (seconds > 0) {
        println("${seconds--}")     // или ${--seconds} (смотря какой считать нулевой секундой)
        Thread.sleep(1000)
    }

    println("Прошло $total секунд")

}