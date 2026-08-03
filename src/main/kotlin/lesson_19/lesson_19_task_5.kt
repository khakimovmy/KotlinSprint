package org.example.lesson_19

data class Person private constructor(
    val name: String,
    val gender: Gender,
) {
    companion object {
        fun register(name: String, gender: String): Person {
            val cleanName = name.trim()
            require(cleanName.isNotBlank()) { "Имя обязательно!" }
            val inputGender = gender.trim().uppercase()
            require(Gender.entries.any {it.name == inputGender }) { "Неверный пол"}
            val personGender = Gender.valueOf(inputGender)
            return Person(cleanName, personGender)
        }
    }
}

enum class Gender { MALE, FEMALE }

fun main() {
    val people: MutableList<Person> = mutableListOf()

    println("Введите данные в формате: Имя, затем пол")
    println("Доступные значения пола: MALE, FEMALE")

    repeat(5) {
        println("Введите имя:")
        val name = readln()
        println("Введите пол(MALE/FEMALE)")
        val gender = readln()
        val person = Person.register(name, gender)
        people.add(person)
    }

    for (person in people) {
        println("Имя: ${person.name}, пол: ${person.gender}")
    }
}