fun countVariants(stairsCount: Int): Int {
    return if (stairsCount <= 2) 1 else countVariants(stairsCount - 2) + countVariants(stairsCount - 1)
}


fun main(args: Array<String>) {
    print("Enter the number of stairs: ")
    val stairsCount = readLine()!!.toInt()
    print(countVariants(stairsCount + 1))
}