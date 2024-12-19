fun main() {

    val userWeight = 50
    val userVolume = 100

    println("Груз с весом $userWeight кг и объемом $userVolume л соответствует категории 'Average': " + ((userWeight > 35) && (userWeight <= 100) && userVolume < 100))

}

const val MINIMUM_WEIGHT = 35
const val MAXIMUM_WEIGHT = 100
const val MAXIMUM_VOLUME = 100
