package org.example.lesson_11

class Category(
    val photoUrl: String,
    val name: String,
    val description: String,
    val recipe: List<Recipe>
)

class Recipe(
    val photoUrl: String,
    val name: String,
    val category: Category,
    val ingredients: List<Ingredient>,
    val time: Int,
    val portions: Int,
    val difficulty: String = "Easy",
    val instruction: List<String>,
)

class Ingredient(
    val ingredientName: String,
    val ingredientAmount: Float,
    val units: String,
)