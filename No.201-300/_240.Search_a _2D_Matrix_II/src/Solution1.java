/**
 * @author Yu-Jing
 * @create 2022/10/25 下午 02:00
 */
public class Solution1 {

    // pointer: start from bottom-left || bottom-right
    // why should we select these two start positions ?
    // what we want is: if target is larger | smaller than value, then only one direction is available.
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = 0;
        int row = matrix.length - 1;
        while(row >= 0 && col < matrix[0].length){
            if (matrix[row][col] > target){
                row--;
            }else if (matrix[row][col] < target){
                col++;
            }else {
                return true;
            }
        }
        return false;
    }
}
