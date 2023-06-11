/**
@author Yu-Jing
@create 2023-06-11-下午 04:56
 */
class Solution1768 {
    fun mergeAlternately(word1: String, word2: String): String {
        var index = 0
        val maxLength = word1.length.coerceAtLeast(word2.length)
        var mergeString = ""

        while(index <= maxLength - 1){
            // case1 : index < word1.length && index < word2.length
            // case2:  index < word1.length && index >=  word2.length
            // case3: index >= word1.length && index <  word2.length

            if (index < word1.length && index < word2.length){
                mergeString += word1[index]
                mergeString += word2[index]
                index++

            } else if (index >= word1.length && index < word2.length) {
                mergeString += word2.subSequence(index, word2.length)
                break

            } else {
                mergeString += word1.subSequence(index, word1.length)
                break
            }
        }
        return mergeString
    }
}