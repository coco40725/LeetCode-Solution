/**
 * @author Yu-Jing
 * @create 2022-09-19-下午 02:12
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (Integer i : nums){
            result = result^i;
        }
        return result;
    }
}

