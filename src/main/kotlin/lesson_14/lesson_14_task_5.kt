package org.example.lesson_14

class Chat() {
    private var id = 1
    fun addMessage(text: String, author: String) {
        val message = Message(id, text, author)
        messages.add(message)
        id++
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val childMessage = ChildMessage(id, text, author, parentMessageId)
        messages.add(childMessage)
        id++
    }

    val messages: MutableList<Message> = mutableListOf()

    fun printChat() {
        val grouped = messages.groupBy { if (it is ChildMessage) it.parentMessageId else it.id }

        grouped.forEach { (key, value) ->
            value.forEach {
                if (it is ChildMessage) {
                    println("\t${it.author}: ${it.text}")
                } else {
                    println("${it.author}: ${it.text}")
                }
            }
        }
    }
}

open class Message(val id: Int, val text: String, val author: String) {}
class ChildMessage(id: Int, text: String, author: String, val parentMessageId: Int) : Message(id, text, author)

fun main() {
    val chat = Chat()

    chat.addMessage("Good morning!", "Lebron")
    chat.addThreadMessage("Good morning, too!", "Jamal", 1)
    chat.addMessage("Good evening!", "Husain")
    chat.addThreadMessage("Good evening, too!", "Tina", 3)

    chat.printChat()
}