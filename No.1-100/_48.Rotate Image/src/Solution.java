
/**
 * @author Yu-Jing
 * @create 2022-10-10-下午 12:26
 */
public class Solution {
    public void rotate(int[][] matrix) {
        // Method1: Transpose the matrix then reverse the order of column
        // Method2:  reverse the order of row then transpose the matrix
        reverseRowOrder(matrix);
        transpose(matrix);
    }

    public void transpose(int[][] matrix){
        for (int i = 0; i < matrix.length - 1; i++){
            for (int j = i + 1 ; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }


    public void reverseRowOrder(int[][] matrix){
        for (int i = 0; i < matrix.length / 2; i++){
            int[] temp = matrix[i];
            matrix[i] = matrix[matrix.length - 1 - i];
            matrix[matrix.length - 1 - i] = temp;
        }
    }
}
