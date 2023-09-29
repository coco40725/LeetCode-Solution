/**
@author Yu-Jing
@create 2023-09-29-下午 09:35
 */
class Solution1456(){
    fun maxVowels(s: String, k: Int): Int {
        var sum = 0
        val vowelList = listOf('a', 'e', 'i', 'o', 'u')
        for (i in 0 until k){
            if (vowelList.contains(s[i])) sum++
        }

        var max = sum
        for (j in k until s.length){
            if (vowelList.contains(s[j])) sum++
            if (vowelList.contains(s[j - k])) sum--
            max = max.coerceAtLeast(sum)
        }

        return max

    }
}