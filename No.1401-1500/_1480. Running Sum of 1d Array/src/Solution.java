/**
 * @author Yu-Jing
 * @create 2023/2/8 下午 02:41
 */
public class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            nums[i] = sum + nums[i];
            sum = nums[i];
        }
        return nums;
    }
}
