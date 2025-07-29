package kotlin_code.easy

// helper function to validate vowel as a char
fun validateVowel(char: Char): Boolean {

    // check for a vowel in O(1) time, normalizing for case
    return when(char.lowercaseChar()) {
        'a', 'e', 'i', 'o', 'u', 'y' -> true
        else -> false
    }
}

fun reverseVowels(s: String) : String {

    // convert the string to a var
    var newString = s.toCharArray()

    // left to right pointer
    var i = 0

    // right to left pointer
    var j = newString.size-1

    while (i < j) {

        // Found vowel on the left side
        if(validateVowel(newString[i])) {

            // check for a vowel incrementing from right to left
            while (i < j) {

                // vowel found on the right side
                if(validateVowel(newString[j])) {

                    // swap
                    var swapChar = newString[i]
                    newString[i] = newString[j]
                    newString[j] = swapChar

                    // advance pointers
                    i++
                    j--
                    break
                } else {
                    // else, keep looking right to left
                    j--
                }
            }
        } else {
            // else, keep looking
            i++
        }
    }
    return newString.concatToString()
}

fun main() {
    println(reverseVowels("IceCreAm"))
    println(reverseVowels("leetcode"))
}