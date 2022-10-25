import java.util.Arrays;

/**
 * @author Yu-Jing
 * @create 2022/10/25 下午 03:35
 */
public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {5,4,3,2,1};
        System.out.println(sol.increasingTriplet(arr));
    }
    public boolean increasingTriplet(int[] nums) {
        // if there exists a triple of indices (i, j, k) such that
        // i < j < k and nums[i] < nums[j] < nums[k]
        if (nums.length < 3) return false;
        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                if (nums[i] < nums[j]) {
                    for (int k = j + 1; k < nums.length; k++){
                        if (nums[i] < nums[k] && nums[j] < nums[k]) return true;
                    }
                }
            }
        }
        return false;
    }
}
