fun main() {

    val moveString = "D2-D4;0"

    val fromWhere = moveString.substring(0..1)
    val toWhere = moveString.substring(3..4)
    val moveNumber = moveString.substring(6)

    println("Игрок сделал ход с $fromWhere на $toWhere. Номер хода: $moveNumber")

}