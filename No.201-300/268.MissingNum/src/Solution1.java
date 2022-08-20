/**
 * @author Yu-Jing
 * @create 2022-07-29-PM 04:19
 */
public class Solution1 {
    public int missingNumber(int[] nums) {
        if (nums.length == 1 && nums[0] == 0) return 1;
        if (nums.length == 1 && nums[0] != 0) return 0;

        int sum = 0;
        int n = nums.length;

        for (int i = 0 ;  i <  n ; i++){
            sum += nums[i];
        }

        return ((1 + n) * n) / 2 - sum;
    }
}
