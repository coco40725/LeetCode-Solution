/**
@author Yu-Jing
@create 2023-06-18-下午 05:56
 */
class Solution605 {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var currentIndex = 0
        var count = 0
        var prevIndex = currentIndex - 1
        var nextIndex = currentIndex + 1


        while(currentIndex < flowerbed.size){
            val currentEle = flowerbed[currentIndex]
            val nextEle: Int = try {
                flowerbed[nextIndex]
            } catch (e: Exception){
                -9
            }
            val lastEle: Int = try {
                flowerbed[prevIndex]
            } catch (e: Exception){
                -9
            }

            // we can put the flower in the current index if:
            // (prev - current - next)
            // 1. 0 0 0
            // 2. -9 0 0
            // 3. 0 0 -9
            // 4. -9 0 -9
            if (currentEle == 0 && lastEle == 0 && nextEle == 0){
                flowerbed[currentIndex] = 1
                count ++
            } else if (lastEle == -9  && currentEle == 0 && nextEle == 0){
                flowerbed[currentIndex] = 1
                count ++

            } else if (lastEle == 0 && currentEle == 0 && nextEle == -9){
                flowerbed[currentIndex] = 1
                count ++

            } else if (lastEle == -9 && currentEle == 0 && nextEle == -9){
                flowerbed[currentIndex] = 1
                count ++
            }


            currentIndex ++
            prevIndex ++
            nextIndex ++
        }
        return n <= count
    }
}