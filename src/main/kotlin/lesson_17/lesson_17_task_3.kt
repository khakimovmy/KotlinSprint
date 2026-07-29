package org.example.lesson_17

class Folder(val name: String, val filesAmount: Int, private val isSecret: Boolean) {

    val folderName: String
        get() = if (isSecret) "скрытая папка"
        else name

    val filesCount: Int
        get() = if (isSecret) 0
        else filesAmount
}

fun main() {
    val folder1 = Folder("Personal", 20, true)
    println(folder1.folderName)
    println(folder1.filesCount)
}