package lesson_5

fun main() {

    println("Введите расстояние поездки (в километрах)")
    val distance = readln().toDouble()

    println("Введите расход топлива на 100 км (в литрах)")
    val fuelConsumption = readln().toDouble()

    println("Введите текущую цену за литр топлива")
    val fuelPrice = readln().toDouble()

    val totalFuelLitres = (distance * fuelConsumption) / 100

    val totalFuelPrice = totalFuelLitres * fuelPrice

    println("Общее количество необходимого топлива составляет: %.2f".format(totalFuelLitres))
    println("Итоговая стоимость поездки составляет: %.2f".format(totalFuelPrice))

}