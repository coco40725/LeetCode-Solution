/**
 * @author Yu-Jing
 * @create 2023/2/8 下午 02:57
 */
public class Solution1 {
    public static void main(String[] args) {

    }
    public int pivotIndex(int[] nums){
        int sum = 0;
        int lsum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++){
            if (i > 0) lsum += nums[i - 1];
            if ((sum - lsum - nums[i]) == lsum) return i;

        }
        return -1;
    }
}
