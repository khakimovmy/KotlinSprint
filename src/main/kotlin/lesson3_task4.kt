fun main() {

    var fromWhere = "E2"
    var toWhere = "E4"
    var moveNumber = fromWhere + toWhere

    var moveString = "$fromWhere-$toWhere;$moveNumber"
    println("Игрок с белыми сделал ход: $moveString")

    fromWhere = "D2"
    toWhere = "D3"
    moveNumber = fromWhere + toWhere

    moveString = "$fromWhere-$toWhere;$moveNumber"
    println("Игрок с белыми сделал следующий ход: $moveString")

}
