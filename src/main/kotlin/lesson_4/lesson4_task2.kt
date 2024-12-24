package lesson_4

fun main() {

    val userWeight1 = 20
    val userVolume1 = 80
    val userWeight2 = 50
    val userVolume2 = 100


    println("Груз с весом $userWeight1 кг и объемом $userVolume1 л соответствует категории 'Average': " +
            ((userWeight1 > MINIMUM_WEIGHT) && (userWeight1 <= MAXIMUM_WEIGHT) && (userVolume1 < MAXIMUM_VOLUME)))


    println("Груз с весом $userWeight2 кг и объемом $userVolume2 л соответствует категории 'Average': " +
            ((userWeight2 > MINIMUM_WEIGHT) && (userWeight2 <= MAXIMUM_WEIGHT) && (userVolume2 < MAXIMUM_VOLUME)))

}

const val MINIMUM_WEIGHT = 35
const val MAXIMUM_WEIGHT = 100
const val MAXIMUM_VOLUME = 100
