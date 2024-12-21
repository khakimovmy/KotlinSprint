package lesson_2

fun main() {

    val workers: Int = 50 // Рабочие
    val workersSalary: Int = 30_000 // Зарплата 1го рабочего
    val totalWorkersSalary = workers * workersSalary // Общаяя зарлата рабочих

    val interns: Int = 30 // Стажеры
    val internsSalary: Int = 20_000 // Зарплата 1го стажера
    val totalInternsSalary = interns * internsSalary // Общаяя зарплата стажеров

    val totalCrew = workers + interns // Общее количество сотрудников после устройства стажеров
    val totalSalary = totalWorkersSalary + totalInternsSalary  // Общая зарплата
    val averageSalary = totalSalary / totalCrew // Средняя зарплата

    println("Зарплата постоянных сотрудников составляет: $totalWorkersSalary рублей")
    println("Общие расходы по ЗП после прихода стажеров составляет: $totalSalary рублей")
    println("Средняя зарплата одного сотрудника после устройства стажеров: $averageSalary рублей")

}
