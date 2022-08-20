import java.util.*;

/*
* Given an integer array nums and an integer k,
* return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
*
* Use sliding Window
* */
/**
 * @author Yu-Jing
 * @create 2022-08-02-PM 04:21
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

}

