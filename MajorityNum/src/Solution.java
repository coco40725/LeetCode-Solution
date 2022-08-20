import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Yu-Jing
 * @create 2022-07-29-PM 02:08
 */
public class Solution {
    public static void main(String[] args) {
        int[] n = new int[]{2,2,1,1,2,1,2,1,6};
        int num = new Solution().majorityElement(n);
        System.out.println(num);
    }


    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer max_key = null;

        for (Integer i : nums){
            if (map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else {
                map.put(i, 1);
            }
        }

        for (Integer key : map.keySet()){
            if (max_key != null){
                max_key =  map.get(key) > map.get(max_key) ? key : max_key;
            }else{
                max_key = key;
            }

        }
        return max_key;

    }

}
