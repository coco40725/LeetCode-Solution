/**
@author Yu-Jing
@create 2023-10-01-上午 10:14
 */

class Solution1493(){
    fun longestSubarray(nums: IntArray): Int {
        var k = 1
        var left = 0
        nums.forEach { num ->
            if (num == 0) k--
            if (k < 0 && nums[left++] == 0){
                k ++
            }
        }

        return nums.size - left - 1
    }
}