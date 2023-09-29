/**
@author Yu-Jing
@create 2023-09-29-下午 09:11
 */

class Solution643(){
    /**
     * 時間複雜度 O(n*k)
     */
    fun findMaxAverageSlow(nums: IntArray, k: Int): Double {
        var max: Double? = null
        for (i in 0 .. (nums.size - k)){
            var sum = 0
            for (j in i until i + k){
                sum += nums[j]
            }
            if (max == null || sum > max) max = sum.toDouble()
        }
        return max!!/k
    }

    fun findMaxAverage(nums: IntArray, k: Int): Double {
        // create first slide window
        var sum = 0
        for(i in 0 until k) {
            sum+=nums[i]
        }
        var max = sum/(k.toDouble())
        for (i in k until nums.size){
            sum += nums[i]
            sum -= nums[i - k]
            max = max.coerceAtLeast(sum / (k.toDouble()))
        }

        return max
    }
}