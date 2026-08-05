package org.example.lesson_21

import java.io.File

fun File.prependWord(word: String) {
    val lowerWord = word.lowercase()

    val oldText = if (exists()) readText()
    else ""

    val newText = if (oldText.isEmpty()) lowerWord
    else lowerWord + "\n" + oldText

    writeText(newText)
}

fun main() {
    val file = File("words.txt")
    file.prependWord("Hello")
}