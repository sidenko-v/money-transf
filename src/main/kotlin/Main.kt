val VKPAY = "VK Pay"
val MASTERCARD = "Mastercard"
val MAESTRO = "Maestro"
val VISA = "Visa"
val MIR = "Мир"

fun main() {

    var cardType = VISA
    var amount = 300*100
    var pastAmount = 0

    println(getCommission(amount, cardType, pastAmount))
}

fun getCommission(amount: Int, cardType: String = VKPAY, pastAmount: Int = 0): Int {
    var commission: Int =  0
    when (cardType) {
        VKPAY -> commission = 0
        MASTERCARD, MAESTRO -> commission = getMastercardMaestroCom(amount)
        VISA, MIR -> commission = getVisaMirCom(amount)
    }
    return commission
}

fun getVisaMirCom(amount: Int): Int {
    var commission: Int
    val comPer = 0.75
    val minCom = 3500
    if (amount * (comPer / 100) < minCom) {
        commission = minCom
    } else {
        commission = (amount * (comPer / 100)).toInt()
    }
    return commission
}

fun getMastercardMaestroCom(amount: Int): Int {
    var commission: Int
    if (amount in 300 * 100..75_000 * 100) {
        commission = 0
    } else {
        commission = (amount * (0.6 / 100) + 20 * 100).toInt()
    }
    return commission
}

