import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Yu-Jing
 * @create 2022-09-19-下午 02:35
 */
public class Solution {
    public static void main(String[] args) {
        int[] num = new int[]{0,2,2,1,0,0,2,1};
        Solution sol = new Solution();
        sol.sortColors(num);
        System.out.println(Arrays.toString(num));
    }

    public void sortColors(int[] nums) {
        // bubble sorting
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < (nums.length - 1) - i; j++){
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
