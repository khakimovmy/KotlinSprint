package lesson_7

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    val time = readln().toInt()

    for (i in time downTo 0) {
        println("До конца осталось: $i секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}