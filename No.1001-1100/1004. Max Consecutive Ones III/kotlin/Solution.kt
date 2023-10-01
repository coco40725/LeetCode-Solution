/**
@author Yu-Jing
@create 2023-09-30-下午 09:14
 */

class Solution1004(){
    /**
     * 1. 始終擴展右邊界
     * 2. 只在必要時移動左邊界: 當 k 小於 0時才開始縮減
     */
    fun longestOnes(nums: IntArray, k: Int): Int {
        //
        var left = 0
        var addCount = k
        nums.forEach { num ->
            // num 是 0則要減 addCount
            if (num == 0) addCount --

            // addCount 用完了，left 開始左移
            // 若出現 0，則 addCount 要加回來
            if (addCount < 0 && nums[left++] == 0){
                addCount ++
            }
            println(left)
        }
        println("addCount = $addCount, left = $left")

        return nums.size - left
    }
}
//k = 2, 7
//9
//1 1 0 0 1 1 1 0 1 0 0 0
//left = 0, addcount = 2
//        index = 7, left = 1
//        index = 8, left = 2
//
