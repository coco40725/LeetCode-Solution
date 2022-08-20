/**
 * @author Yu-Jing
 * @create 2022-08-12-AM 09:01
 */
public class Solution1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;
        while(row < matrix.length && column >= 0){
            if (matrix[row][column] == target){
                return true;
            }else {
                if (matrix[row][column] < target){
                    row++;
                }else {
                    column--;
                }
            }
        }
        return false;
    }
}
