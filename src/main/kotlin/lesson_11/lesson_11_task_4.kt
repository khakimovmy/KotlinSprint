package org.example.lesson_11

class Category(
    val photo: String,
    val name: String,
    val description: String,
)

class Recipe(
    val name: String,
    val category: Category,
    val ingredients: List<Ingredient>,
    val time: Int,
    val portions: Int,
    val difficulty: String = "Easy",
    val instruction: String,
)

class Ingredient(
    val ingredientName: String,
    val ingredientAmount: Int,
)

