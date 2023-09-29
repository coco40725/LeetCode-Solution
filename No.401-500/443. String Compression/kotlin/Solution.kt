/**
@author Yu-Jing
@create 2023-09-19-下午 10:06
 */
class Solution443{
    fun compress(chars: CharArray): Int {
        if (chars.isEmpty()) return 0
        if (chars.size == 1 ) return 1

        var oldChar = chars[0]
        var string = ""
        var count = 1
        for (i in 1 until chars.size) {
            val newChar = chars[i]
            if (newChar == oldChar) {
                count++
                if (i == chars.size - 1) string = string + oldChar + count
            } else {
                if (count > 1) {
                    string = string + oldChar + count
                } else {
                    string += oldChar
                }
                if (i == chars.size - 1) string += newChar
                count = 1
            }
            oldChar = chars[i]
        }

        for (j in string.indices) {
            chars[j] = string[j]
        }

        return string.length
    }
}