/**
@author Yu-Jing
@create 2023-09-17-下午 07:16
 */

class Solution345 {
    /**
     * 這個寫法沒有錯，但是當 string 長度非常長的時候，這個寫法就會非常耗時間
     * 一共用了3次迴圈，第一次是找出所有的母音，第二次是反轉母音，第三次是將反轉後的母音放回原本的 string
     */
    fun reverseVowels_fail(s: String): String {
        val vowels = listOf<Char>('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        val indexVowelMap = mutableMapOf<Int, Char>()
        s.forEachIndexed { index, c ->
            if (vowels.contains(c)){
                indexVowelMap[index] = c
            }
        }

        // reverse the indexVowelMap's value
        var indexVowelMapValuesReversed =  indexVowelMap.values.reversed()
        indexVowelMap.forEach { t, u ->
            indexVowelMap[t] = indexVowelMapValuesReversed.first()
            indexVowelMapValuesReversed = indexVowelMapValuesReversed.drop(1)
        }

        // replace the original string
        var result = s
        indexVowelMap.forEach { t, u ->
            result = result.replaceRange(t, t+1, u.toString())
        }
        return result
    }

    /**
     * 使用 two pointer
     */
    fun reverseVowels(s: String): String{
        val vowels = listOf<Char>('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        var result = s.toCharArray()
        var prevIndex = 0
        var nextIndex = s.length - 1

        while (nextIndex > prevIndex){
            val prevEle = s[prevIndex]
            val nextEle = s[nextIndex]

            // case 1. prevEle is vowel, nextEle is vowel --> swap, and move these two pointer
            // case 2. prevEle is vowel, nextEle is not vowel --> move nextIndex
            // case 3. prevEle is not vowel, nextEle is vowel --> move prevIndex
            // case 4. prevEle is not vowel, nextEle is not vowel --> move these two pointer
            if (prevEle in vowels && nextEle in vowels){
                result[prevIndex] = nextEle
                result[nextIndex] = prevEle
                prevIndex ++
                nextIndex --
            } else if (prevEle in vowels && nextEle !in vowels){
                nextIndex --
            } else if (prevEle !in vowels && nextEle in vowels){
                prevIndex ++
            } else {
                prevIndex ++
                nextIndex --
            }
        }
        return result.joinToString("")
    }
}