/**
@author Yu-Jing
@create 2023-09-17-下午 07:47
 */
class Solution151{
    fun reverseWords(s: String): String {
        // remove the space in the head and tail
        val trimedString = s.trim()

        // split the string by multiple space
        val words = trimedString.split("\\s+".toRegex())

        // reverse the words
        val reversedWords = words.reversed()

        return reversedWords.joinToString(" ")

    }
}