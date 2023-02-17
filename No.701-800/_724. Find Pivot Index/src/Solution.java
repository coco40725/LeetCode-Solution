import java.util.Arrays;

/**
 * @author Yu-Jing
 * @create 2023/2/8 下午 02:44
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 1) return 0;

        for (int i = 0; i < nums.length; i ++){
            int[] arrRight = Arrays.copyOfRange(nums, i + 1, nums.length);

            if (i == 0) {
                if (0 == sumArr(arrRight)) return 0;

            } else {
                int[] arrLeft = Arrays.copyOfRange(nums, 0, i);
                if (sumArr(arrLeft) == sumArr(arrRight)) return i;
            }
        }
        return -1;
    }

    public int sumArr(int[] nums){
        int sum = 0;
        for (int n : nums){
            sum += n;
        }
        return sum;
    }
}
