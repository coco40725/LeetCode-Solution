import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022-08-10-PM 04:19
 */
public class Solution {
    public static void main(String[] args) {
        int[][] nn = new int[][]{{1,2},{3,4}};
        int[][] nm =new Solution().matrixReshape(nn,1,4);

    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if (r * c != mat[0].length * mat.length) return mat;

        int[][] newMat = new int[r][c];
        for (int row = 0; row < mat.length ; row++){
            for (int column = 0; column < mat[0].length; column++){
                // 1D index = row * column_number + column
                int new_row = (row * mat[0].length + column) / c;
                int new_column = (row * mat[0].length + column) % c;
                newMat[new_row][new_column] = mat[row][column];
            }
        }

        return newMat;

    }

}
