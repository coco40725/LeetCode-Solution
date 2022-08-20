import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022-07-29-PM 03:56
 */
public class Solution {
    public static void main(String[] args) {
        int[] n = new int[]{0,3,1};
       int num = new Solution().missingNumber(n);
        System.out.println(num);
    }

    public int missingNumber(int[] nums) {
        if (nums.length == 1 && nums[0] == 0) return 1;
        if (nums.length == 1 && nums[0] != 0) return 0;

        Arrays.sort(nums);
        if (nums[0] != 0) return 0;

        for (int  i = 0; i < nums.length - 1 ; i++){
            if (nums[i + 1] - nums[i] > 1) return (nums[i + 1] - 1);
        }
        return nums[nums.length -1 ] + 1;
    }
}
