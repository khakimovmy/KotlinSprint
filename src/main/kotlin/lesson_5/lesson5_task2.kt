package lesson_5

import java.time.Year

fun main() {

    val year = Year.now().value

    println("Введите год вашего рождения: ")

    val birthYear = readln().toInt()
    val userAge = year - birthYear

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else if (userAge == LIMITED_AGE_1 || userAge == LIMITED_AGE_2) {
        "Показать экран с лимитированным контентом"
    } else {
        "Вернуться на главный экран"
    }

    println(resultText)

}

const val AGE_OF_MAJORITY = 18
const val LIMITED_AGE_1 = 16
const val LIMITED_AGE_2 = 17
