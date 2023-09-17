/**
@author Yu-Jing
@create 2023-06-18-下午 05:35
 */
class Solution1431 {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        // max candy
        val maxCandy = candies.max() ?: 0

        val result = mutableListOf<Boolean>()

        candies.forEach { candy ->
            if ((candy + extraCandies) >= maxCandy) {
                result.add(true)
            } else {
                result.add(false)
            }
        }

        return result
    }
}