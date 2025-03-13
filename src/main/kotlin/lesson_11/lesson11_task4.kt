package lesson_11

class Category(
    val name: String,
)

class Ingredient(
    val name: String,
    val quantity: String,
)

class Recipe(
    val title: String,
    val category: Category,
    val ingredient: List<Ingredient>,
    val instruction: String,
)

fun main() {
    val category = Category("Бургеры")

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

    val burgerRecipe = Recipe(
        title = "Бургер с грибами и сыром",
        category = category,
        ingredient = burgerIngredient,
        instruction = "\n1. В глубокой миске смешайте говяжий фарш, лук, чеснок, соль и перец. Разделите фарш на 4 равные части и сформируйте котлеты.\n"  +
        "2. Разогрейте сковороду на среднем огне. Обжаривайте котлеты с каждой стороны в течение 4-5 минут или до желаемой степени прожарки.\n" +
        "3. В то время как котлеты готовятся, подготовьте булочки. Разрежьте их пополам и обжарьте на сковороде до золотистой корочки.\n" +
        "4. Смазать нижние половинки булочек горчицей и кетчупом, затем положите лист салата, котлету, кольца."
    )

    println("Рецепт: ${burgerRecipe.title}")
    println("Категория: ${category.name}")
    println("Ингредиенты:")
    burgerRecipe.ingredient.forEach {
        println(" - ${it.name}: ${it.quantity}")
    }
    println("Инструкция: ${burgerRecipe.instruction}")
}