import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022/10/25 上午 10:43
 */
public class Solution {
    public static void main(String[] args) {

        Solution sol = new Solution();
        int[][] arr = {{1,3,5,7,9},{2,4,6,8,10}, {3,6,9,12,22}, {10,13,14,17,24}, {18,21,23,26,30}};
        System.out.println(sol.searchMatrix(arr, 13));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 1 && matrix[0].length == 1) return matrix[0][0] == target;
        int rowNum = matrix.length;
        int colNum = matrix[0].length;

        // narrow the column
        List<Integer> colArr = new ArrayList<>();
        for (int i = 0; i < colNum; i++){
            if (matrix[0][i] <= target && matrix[rowNum - 1][i] >= target) {
                colArr.add(i);
            }
        }

        // narrow the row
        List<Integer> rowArr = new ArrayList<>();
        for (int i = 0; i < rowNum; i++){
            if (matrix[i][0] <= target && matrix[i][colNum - 1] >= target) {
                rowArr.add(i);
            }
        }

        // search small matrix
        if (colArr.size() == 0 && rowArr.size() == 0) return false;

        if (colArr.size() == 0 && rowArr.size() != 0){
            for (int i = 0; i < rowArr.size(); i ++){
                if (matrix[rowArr.get(i)][0] == target) return true;
            }

        }else if (colArr.size() != 0 && rowArr.size() == 0){
            for (int i = 0; i < colArr.size(); i++){
                if (matrix[0][colArr.get(i)] == target) return true;
            }

        }else{
            for (int i = 0; i < rowArr.size(); i ++){
                for (int j = 0; j < colArr.size(); j++){
                    if (matrix[rowArr.get(i)][colArr.get(j)] == target) return true;
                }
            }
        }

        return false;
    }
}
