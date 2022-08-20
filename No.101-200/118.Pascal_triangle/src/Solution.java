import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022-08-11-PM 01:57
 */
public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> list = new Solution().generate(5);
        System.out.println(list.toString());

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++){
            List<Integer> tmpList = new ArrayList<>();
            int j = 1;
            tmpList.add(1);

           while(j <= i){
               if (j == i) {
                   tmpList.add(1);
                   break;
               }

               tmpList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
               j++;
           }
            list.add(tmpList);
        }
        return list;
    }
}
