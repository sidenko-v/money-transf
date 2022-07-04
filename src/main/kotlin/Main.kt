fun main() {

    val comPer = 0.75
    val minCom = 3500
    val amount = 1000000
    val comission = (amount * comPer / 100).toInt()
    var amountWithCom: Int

    if (comission < minCom) {
        amountWithCom = amount+minCom
        println("Для суммы перевода $amount комиссия будет $minCom копеек, итоговая сумма $amountWithCom копеек")
    } else {
        amountWithCom = amount+comission
        println("Для суммы перевода $amount комиссия будет $comission копеек, итоговая сумма $amountWithCom копеек")
    }
}