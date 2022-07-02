fun minSplit(amount: Int): Int {
    var amo = amount
    var count = 0
    var i = 0
    val availableCoins: IntArray = intArrayOf(50, 20, 10, 5, 1)
    while (amo != 0) {
        if (amo < availableCoins[i]) {
            i++
        } else {
            amo -= availableCoins[i]
            count++
        }
    }
    return count
}


fun main(args: Array<String>) {
    print("Enter amount of monets: ")
    val amount = readLine()!!.toInt()
    print(minSplit(amount))
}