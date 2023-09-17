/**
@author Yu-Jing
@create 2023-09-17-下午 07:54
 */
class Solution238{
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        // prepare two arrays: forward and backward
        val forwardArr = IntArray(nums.size)
        var product = 1
        for (i in nums.indices){
            forwardArr[i] = product
            product  *= nums[i]
        }
        val backwardArr = IntArray(nums.size)
        product = 1
        for (i in nums.size - 1 downTo 0){
            backwardArr[i]  = product
            product *= nums[i]
        }

        // calculate the result
        for (i in nums.indices){
            result[i] = forwardArr[i] * backwardArr[i]
        }
        return result

    }


}