package org.example.lesson_17

class Quiz(question: String, answer: String) {
    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }

    val question: String = question
        get() = field
}