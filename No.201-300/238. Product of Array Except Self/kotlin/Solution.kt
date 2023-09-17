/**
@author Yu-Jing
@create 2023-09-17-下午 07:54
 */
class Solution238{
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var product = 1
        for (i in nums.indices){
            result[i] = product
            product *= nums[i]
        }
        product = 1
        for (i in nums.size - 1 downTo 0){
            result[i] *= product
            product *= nums[i]
        }
        return result

    }
}