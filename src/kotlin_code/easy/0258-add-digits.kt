package kotlin_code.easy


// Add Digits # 258

fun addDigits(num: Int): Int {

    // convert the number to a string
    var number = num.toString()

    // handle edge case
    if( num.toString().length == 1) {
        return num
    } else {
        // initialize a running sum
        var runningSum = 0

        // continue until we get a single digit
        while (number.length > 1) {

            // convert each number back to a digit to add
            number.forEach {
                runningSum += it.digitToInt()
            }

            // reassign the running number to the number string.
            number = runningSum.toString()

            // reset the runningSum
            runningSum = 0
        }
    }
    return number.toInt()
}

fun main() {
    // testing
    println(addDigits(38))
    println(addDigits(0))
    println(addDigits(123))
    println(addDigits(999))
}