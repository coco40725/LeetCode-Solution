/**
 * @author Yu-Jing
 * @create 2022-08-11-PM 04:01
 */
public class Solution {
    public static void main(String[] args) {
        int[][] n = new int[][]{{1,3,5,7},{10,11,16,20},{20,30,34,50}};
        System.out.println(new Solution().searchMatrix(n,28));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        // 1. Two pointer: search first value for in each row.
        // return true, or largest value < target
        int specific_row = 0;
        if (matrix.length > 1){
            int left_out = 0;
            int right_out = matrix.length - 1;
            int mid_out = (left_out + right_out) / 2;

            while(left_out < right_out && (right_out - left_out) > 1){
                mid_out = (left_out + right_out) / 2;
                if (matrix[mid_out][0] > target) {
                    right_out = mid_out;
                }else if (matrix[mid_out][0] < target){
                    left_out = mid_out;
                }else {
                    return true;
                }
            }
            if (target > matrix[left_out][0] &&  target < matrix[right_out][0]) {
                specific_row = left_out;
            }else if (target > matrix[right_out][0]){
                specific_row = right_out;
            }else if (matrix[left_out][0] > target){
                return false;
            }else if (matrix[right_out][0] == target || matrix[left_out][0] == target){
                return true;
            }

        }



        // 2. Two pointer: search the target in the specific row : matrix[left_out]
        int left_in = 0;
        int right_in = matrix[specific_row].length - 1;
        int mid_in = (left_in + right_in) / 2;

        while(left_in < right_in && (right_in - left_in) > 1){
            mid_in = (left_in + right_in) / 2;
            if (matrix[specific_row][mid_in] > target) {
                right_in = mid_in;
            }else if (matrix[specific_row][mid_in] < target){
                left_in = mid_in;
            }else {
                return true;
            }
        }
        if (matrix[specific_row][left_in] == target || matrix[specific_row][right_in] == target) {
            return true;
        }
        return false;

    }
}
