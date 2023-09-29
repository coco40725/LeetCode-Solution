/**
@author Yu-Jing
@create 2023-09-19-下午 10:48
 */
class Solution283{
    fun moveZeroes(nums: IntArray): Unit {
        if (nums.size >= 2){
            var prevIndex = 0
            var nextIndex = 1
            for (i in 0 until nums.size){
                val prevEle = nums[prevIndex]
                val nextEle = nums[nextIndex]

                if (prevEle == 0 && nextEle != 0){
                    // swap
                    nums[prevIndex] = nextEle
                    nums[nextIndex] = prevEle
                    prevIndex ++
                    if (nextIndex < nums.size - 1) nextIndex ++

                } else if (prevEle == 0 && nextEle == 0){
                    // find the next non-zero element
                    if (nextIndex < nums.size - 1) nextIndex ++

                } else {
                    // move two pointers
                    prevIndex ++
                    if (nextIndex < nums.size - 1) nextIndex ++

                }
            }
        }
    }
}