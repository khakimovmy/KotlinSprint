fun main() {

    val moveString = "D2-D4;0"

    val (fromWhere, toWhere) = moveString.split("-", ";")
    val moveNumber = moveString.split(";")[1]

    println("Игрок сделал ход с $fromWhere на $toWhere. Номер хода: $moveNumber")

}
