import java.util.HashMap;

/**
 * @author Yu-Jing
 * @create 2022-08-11-PM 02:20
 */
public class Solution {
    public static void main(String[] args) {
        char[][] b = new char[][]{
                {'.','.','.','.','5','.','.','1','.'},
                {'.','4','.','3','.','.','.','.','.'},
                {'.','.','.','.','.','3','.','.','1'},
                {'8','.','.','.','.','.','.','2','.'},
                {'.','.','2','.','7','.','.','.','.'},
                {'.','1','5','.','.','.','.','.','.'},
                {'.','.','.','.','.','2','.','.','.'},
                {'.','2','.','9','.','.','.','.','.'},
                {'.','.','4','.','.','.','.','.','.'}};
        boolean boo = new Solution().isValidSudoku(b);
        System.out.println(boo);
    }
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer> map_row = new HashMap<>();
        HashMap<Character, Integer> map_column = new HashMap<>();
        HashMap<Character, Integer> map9 = new HashMap<>();
        int r = -1;
        int c = -1;

        // check row and column
        for (int i = 0; i < board.length; i++){
            map_row = new HashMap<>();
            map_column = new HashMap<>();
           for (int j = 0; j < board.length; j++ ){
               if (map_row.get(board[i][j]) != null) return false;
               if (board[i][j] != '.') map_row.put(board[i][j], 1);
               if (map_column.get(board[j][i]) != null) return false;
               if (board[j][i] != '.') map_column.put(board[j][i], 1);

               // check 3*3
               if ( r != i / 3 || c != j / 3){
                   map9 = new HashMap<>();
                   r = i / 3;
                   c = j / 3;
                   for (int k = r * 3; k < ( r * 3 + 3); k++){
                       for (int p = c * 3; p < ( c * 3 + 3); p++){
                           if (board[k][p] == '.' ) continue;
                           if (map9.get(board[k][p]) != null) return false;
                           map9.put(board[k][p], 1);

                       }
                   }
               }


           }
        }
        return true;

    }


}
