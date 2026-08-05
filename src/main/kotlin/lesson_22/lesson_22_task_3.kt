package org.example.lesson_22

data class Movie(val title: String, val director: String, val year: Int)

fun main() {
    val movie1 = Movie("The Godfather", "Francis Ford Coppola", 1972)
    val (title, director, year) = movie1

    println("Title: \"$title\"\nDirector: $director\nYear: $year")
}