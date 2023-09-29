/**
@author Yu-Jing
@create 2023-09-29-下午 03:54
 */
class Solution11(){

    /**
     * 這個效率太差 O(n^2)
     */
    fun maxAreaFail(height: IntArray): Int {
        var maxArea = 0
        var leftIndex = 0
        var rightIndex = 1

        while (leftIndex < height.size - 1 ) {
           while (rightIndex <= height.size - 1){
               val currentBottom = rightIndex - leftIndex
               val currentHeight = height[leftIndex].coerceAtMost(height[rightIndex])
               val currentArea = currentBottom * currentHeight
               if (currentArea > maxArea) maxArea = currentArea
               rightIndex ++
           }
            leftIndex ++
            rightIndex = leftIndex + 1
        }
        return maxArea
    }

    /**
     * O(n)
     */
    fun maxArea(height: IntArray): Int{
        var maxArea = 0
        var leftIndex = 0
        var rightIndex = height.size - 1

        while (leftIndex < rightIndex){
            val currentBottom = rightIndex - leftIndex
            val currentHeight = height[leftIndex].coerceAtMost(height[rightIndex])
            val currentArea = currentBottom * currentHeight
            if (currentArea > maxArea) maxArea = currentArea

            if (height[leftIndex] < height[rightIndex]){
                leftIndex ++
            } else {
                rightIndex --
            }
        }
        return maxArea

    }
}