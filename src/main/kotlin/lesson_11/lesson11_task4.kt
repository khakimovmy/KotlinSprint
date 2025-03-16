package lesson_11

class Category(
    val id: String,
    val name: String,
    val imageUrl: String,
    val recipeList: MutableList<Recipe> = mutableListOf(),
)

class Ingredient(
    val name: String,
    val quantity: String,
)

class Recipe(
    val title: String,
    val category: Category,
    val ingredients: List<Ingredient>,
    val instruction: String,
) {
    init {
        category.recipeList.add(this) // Добавляем рецепт в список при создании
    }
}

fun main() {
    val category = Category(
        "0001",
        "Бургеры",
        "https://tse2.mm.bing.net/th?id=OIP.F5Z2UPdYp5m1lVncysw0eQHaFj&pid=Api",
    )

    val burgerIngredient = listOf(
        Ingredient("Творог", "350 г"),
        Ingredient("Куриное яйцо", "2 штуки"),
        Ingredient("Куриное яйцо", "2 штуки"),
        Ingredient("Пщеничная мука", "6 с. ложек"),
        Ingredient("Пщеничная мука", "6 с. ложек"),
        Ingredient("Подсолнечное масло", "5 с. ложек"),
        Ingredient("Сахар", "2 с. ложки"),
        Ingredient("Сахар", "2 с. ложки"),
        Ingredient("Куриное яйцо", "2 штуки"),
    )

println()

    val burgerRecipe = Recipe(
        title = "Бургер с грибами и сыром",
        category = category,
        ingredients = burgerIngredient,
        instruction = """
            1. В глубокой миске смешайте говяжий фарш, лук, чеснок, соль и перец. Разделите фарш на 4 равные части и сформируйте котлеты.
            2. Разогрейте сковороду на среднем огне. Обжаривайте котлеты с каждой стороны в течение 4-5 минут или до желаемой степени прожарки.
            3. В то время как котлеты готовятся, подготовьте булочки. Разрежьте их пополам и обжарьте на сковороде до золотистой корочки.
            4. Смазать нижние половинки булочек горчицей и кетчупом, затем положите лист салата, котлету, кольца.
        """.trimIndent()
    )

    println("Рецепт: ${burgerRecipe.title}")
    println("Категория: ${category.name}")
    println("Изображение: ${category.imageUrl}")
    println("Ингредиенты:")
    burgerRecipe.ingredients.forEach {
        println(" - ${it.name}: ${it.quantity}")
    }
    println("Инструкция: ${burgerRecipe.instruction}")

    println("\nСписок рецептов в категории '${category.name}':")
    category.recipeList.forEach {
        println(" - ${it.title}")
    }
}