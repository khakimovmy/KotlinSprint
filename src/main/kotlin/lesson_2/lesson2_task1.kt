package lesson_2

fun main() {

    //Список студентов английского языка:
    val student1: Int = 3
    val student2: Int = 4
    val student3: Int = 3
    val student4: Int = 5

    // Посчитаем средний балл
    val averageScore: Double = (student1 + student2 + student3 + student4) / 4.0

    // Выводим результат
    println("Средний балл по английскому для этого класса - $averageScore")
}