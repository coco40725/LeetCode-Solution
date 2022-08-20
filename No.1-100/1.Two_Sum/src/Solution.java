import java.util.HashMap;

/**
 * @author Yu-Jing
 * @create 2022-08-20-下午 03:13
 */
public class Solution {
    // Method 1
    public int[] twoSum(int[] nums, int target) {
        // HashMap.get() is O(1)
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length ; i++){
            // make key -value: nums[i] - index
            if (map.containsKey(target  - nums[i]) ) return new int[]{i, map.get(target - nums[i])};
            // put it later to avoid the case target  - nums[i] = nums[i]
            map.put(nums[i], i);
        }

        return null;
    }
}
