/**
@author Yu-Jing
@create 2023-09-18-下午 09:50
 */
class Solution334{
    /**
     * [2,1,5,0,4,6]
     * 1. if i <= first, first = i
     * 2. if i >= first && i <= second, second = i
     * 3. if i >= second, return true
     */
    fun increasingTriplet(nums: IntArray): Boolean {
        var first = Int.MAX_VALUE
        var second = Int.MAX_VALUE
        for (i in nums){
            if (i <= first){
                first = i
            } else if (i <= second){
                second = i
            } else {
                return true
            }
        }
        return false
    }
}
