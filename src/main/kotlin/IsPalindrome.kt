fun isPalindrome(string: String): Boolean {
    val length = string.length - 1
    for (i in 0..length) {
        if (string[i] != string[length - i]) {
            return false
        }
    }
    return true
}


fun main(args: Array<String>) {
    print("Enter Text: ")
    val string = readLine()!!
    if (isPalindrome(string)) {
        println("$string is Palindrome.")
    } else {
        println("$string is not Palindrome.")
    }
}

