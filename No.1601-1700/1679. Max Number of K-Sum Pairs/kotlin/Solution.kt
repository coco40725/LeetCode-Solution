/**
@author Yu-Jing
@create 2023-09-29-下午 04:34
 */
class Solution1679(){
    /**
     * 這個速度偏慢
     */
    fun maxOperationsSlow(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int, List<Int>>()
        var operations = 0
        nums.forEachIndexed{ index, it ->
            val pairValue = k - it
            val mapList = map[pairValue]
            if (!mapList.isNullOrEmpty()){
                operations ++
                // 移除第一個 element
                map[pairValue] = mapList.drop(1)

            } else {
                val list = mutableListOf<Int>()
                list.addAll(map.getOrDefault(it, listOf()))
                list.add(index)
                map[it] = list
            }
        }
        return operations
    }

    /**
     * 由於是頻繁地對 array 頭尾進行操作，所以使用 ArrayDeque 來提升效率
     * map 可以直接用 compute 來更新
     * O(n)
     */
    fun maxOperationImprove1(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int, ArrayDeque<Int>>()
        var operations = 0
        nums.forEachIndexed { index, it ->
            val pairValue = k - it
            map[pairValue]?.let {deque ->
                if (deque.isNotEmpty()){
                    operations ++
                    deque.removeFirst()
                    return@forEachIndexed
                }
            }
            map.compute(it) {_, deque ->
                (deque?: ArrayDeque()).apply { this.add(index) }
            }
        }
        return operations
    }

    fun maxOperations(nums: IntArray, k: Int): Int{
        // 先排序
        nums.sort()
        var operations = 0
        var firstIndex = 0
        var lastIndex = nums.size - 1

        while (lastIndex > firstIndex){
            val  sum = nums[firstIndex] + nums[lastIndex]
            if (sum == k){
                firstIndex ++
                lastIndex --
                operations ++
            } else if (sum > k){
                lastIndex --
            } else {
                firstIndex ++
            }
        }
        return operations
    }

}