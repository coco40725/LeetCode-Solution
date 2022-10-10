import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022-10-10-上午 11:21
 */


public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        for (Integer integer : s.getRow(30)) {
            System.out.println(integer);
        }

    }

    // Pascal's triangle determines the coefficients which arise in binomial expansions. For example, consider the expansion (x+y)^n
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long nrow = getFactorial(rowIndex);

        list.add(1);
        for (int i = 1; i <= rowIndex; i++){
            long oldvalue = list.get(i-1);
            int newvalue = (int) ((oldvalue * (rowIndex + 1 -i)) / i);
            list.add(newvalue);
        }
        return list;
    }


    public long getFactorial(int n){
        int value = 1;
        for(int i = 1; i <= n ; i++){
            value = value * i;
        }
        return value;
    }
}
