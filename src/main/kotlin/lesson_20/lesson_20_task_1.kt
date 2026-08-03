package org.example.lesson_20

val greet: (String) -> String = { username -> "С наступающим Новым Годом, $username!" }

fun main() {
    println(greet("Kotlin"))
}