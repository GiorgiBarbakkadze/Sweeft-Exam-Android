fun notContains(array: IntArray): Int {
    var isNotInArray = 1
    for (i in array.indices) {
        if (array[i] > 0) {
            if (array.contains(isNotInArray)) {
                isNotInArray++
            }
        }
    }
    return isNotInArray
}


fun main() {
    val array: IntArray = intArrayOf(-1, 1, 2, 0, 50, 45, 12, -53, 15, 23)
    print(notContains(array))
}