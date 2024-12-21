package lesson_3

fun main() {

    var fromWhere = "E2"
    var toWhere = "E4"
    var moveNumber = 1

    var moveString = "$fromWhere-$toWhere;$moveNumber"
    println("Игрок с белыми сделал ход: $moveString")

    fromWhere = "D2"
    toWhere = "D3"
    moveNumber++

    moveString = "$fromWhere-$toWhere;$moveNumber"
    println("Игрок с черными сделал ход: $moveString")

}
