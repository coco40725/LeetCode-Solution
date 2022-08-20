/**
 * @author Yu-Jing
 * @create 2022-08-08-PM 03:34
 */
public class Solution {
    public static void main(String[] args) {
        int[] num = new int[]{1,3,5,6};
        int ans = new Solution().searchInsert(num,0);
        System.out.println(ans);

    }
    // Binary Search
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (right > left && (right - left) > 1){
            int mid = (right + left) / 2;
            if (target > nums[mid]) {
                left = mid;
            }else if (target < nums[mid]){
                right = mid;
            }else {
                return mid;
            }
        }

        //
        if (target <= nums[left]){
            if (left > 0) {
                return left - 1;
            }else{
                return 0;
            }
        }else if (target> nums[left] && target <= nums[right]){
            return left + 1;
        }else{
            return right + 1;

        }



    }
}
