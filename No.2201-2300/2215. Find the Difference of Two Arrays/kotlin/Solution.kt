/**
@author Yu-Jing
@create 2023-10-01-下午 06:21
 */

class Solution2215{
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val map1 = HashMap<Int, Int>()
        val map2= HashMap<Int, Int>()
        val list1 = mutableListOf<Int>()
        val list2 = mutableListOf<Int>()
        nums1.forEachIndexed { index, i ->
            map1[i] = i
        }
        nums2.forEachIndexed { index, i ->
            map2[i] = i
        }
        map1.forEach { (key, value) ->
            if (!map2.containsKey(key)) {
                list1.add(key)
            }
        }
        map2.forEach { (key, value) ->
            if (!map1.containsKey(key)) {
                list2.add(key)
            }
        }
        return listOf(list1, list2)
    }

    fun findDifferenceSet(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val set1 = nums1.toMutableSet()
        val set2 = nums2.toMutableSet()

        val list1 = set1.filterNot { it in set2}
        val list2 = set2.filterNot { it in set1}

        return listOf(list1, list2)
    }
}