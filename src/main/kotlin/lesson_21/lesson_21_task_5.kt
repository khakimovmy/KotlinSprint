package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String? {
    return entries.maxByOrNull { it.value }?.key
}

fun main() {
    val skills = mapOf(
        "Сила" to 100,
        "Ловкость" to 50,
        "Интеллект" to 80
    )
    println(skills.maxCategory())
}