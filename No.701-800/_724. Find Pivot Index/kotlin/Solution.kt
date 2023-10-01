/**
@author Yu-Jing
@create 2023-10-01-下午 06:05
 */
class Solution724(){
    fun pivotIndex(nums: IntArray): Int {
        val sum = nums.sum()
        var leftSum = 0
        for (i in nums.indices) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i
            }
            leftSum += nums[i]
        }


        return -1
    }
}