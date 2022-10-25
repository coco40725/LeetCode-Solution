/**
 * @author Yu-Jing
 * @create 2022-10-10-下午 01:47
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        /*
        * 右: n 下: n 左: n
        * 上: n - 1 , 右: n - 1
        * 下: n - 2, 左: n - 2
        * 上: n - 3 , 右: n - 3
        * 下: n - 4, 左: n - 4
        * */
        /*
        * 0. i = 0, j = 0 : i = 0 --> 5
        * 1. i = 5, j = 0:  j = 0 --> 5
        * 2. i = 5, j = 5 : i = 5 --> 1
        * 3. i = 1, j = 5 : j = 5 --> 1
        * ....
        *
        */
        int[][] mat = new int[n][n];
        // step 0:
        int start = 0;
        int end = n;



        return null;
    }
}
