fun main() {
    println("Введите длину пароля (не менее 6 символов):")
    var passwordLength = readln().toInt()

    while (passwordLength < 6) {
        println("Ошибка! Минимальная длина пароля — 6 символов. Введите снова:")
        passwordLength = readln().toInt()
    }

    val allChars = ('0'..'9') + ('a'..'z') + ('A'..'Z')

    val symbol1: Char = ('0'..'9').random()
    val symbol2: Char = ('a'..'z').random()
    val symbol3: Char = ('A'..'Z').random()

    val password: MutableList<Char> = mutableListOf(symbol1, symbol2, symbol3)

    while (password.size < passwordLength) {
        password.add(allChars.random())
    }

    password.shuffle()

    val finalPassword = password.joinToString("")
    println("Сгенерированный пароль: $finalPassword")
}