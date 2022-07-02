fun isProperly(sequence: String): Boolean {
    var counter = 0
    for (i in sequence.indices) {
        val char = sequence[i]
        if (char == '(') {
            counter++
        } else {
            counter--
        }

        if (counter < 0) {
            return false
        }
    }
    return counter == 0
}


fun main(args: Array<String>) {
    print("Enter sequence: ")
    val sequence = readLine()!!
    if (isProperly(sequence)) {
        println("The sequence of parenthesis: $sequence is correct")
    } else {
        println("The sequence of parenthesis: $sequence is not correct")
    }
}