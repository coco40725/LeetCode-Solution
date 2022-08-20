/**
 * @author Yu-Jing
 * @create 2022-08-09-PM 02:49
 */
public class Solution {
    public static void main(String[] args) {
        int[] n = new int[]{-1};
        System.out.println(new Solution().maxSubArray(n));
    }
    public int maxSubArray(int[] nums) {
        // Dynamic Programming
        int start = 0;
        int end = 0;
        int currentSum = nums[0];
        int maxSum =nums[0];

        // key point 1: When to update start value? when "currentSum(not included nums[i]) + nums[i] > nums[i] " , the start value would be updated to nums[i]
        for (int i = 1; i < nums.length ; i++){

            currentSum += nums[i];
            // change start value
            if (currentSum < nums[i]){
                start = i;
                 end = i;
                 currentSum = nums[i];
            }
            // update maxSum
            if (currentSum > maxSum) {
                maxSum = currentSum;
                end = i;
            }
        }

        System.out.println("The start index: " + start + "; the end index: " + end);
        return maxSum;
    }
}
