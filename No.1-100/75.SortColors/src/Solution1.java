import java.util.*;

/**
 * @author Yu-Jing
 * @create 2022-09-19-下午 02:54
 */
public class Solution1 {
//    public static void main(String[] args) {
//        int[] num = new int[]{0,2,2,1,0,0,2,1,1,1,1,0,2};
//        Solution1 sol = new Solution1();
//        sol.sortColors(num);
//        System.out.println(Arrays.toString(num));
//    }

    public void sortColors(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for (Integer i : nums){
            map.put(i , map.get(i) + 1);
        }

        int j = 0;
        for (int i = 0; i < 3; i++){
            while(map.get(i) != 0 ){
                nums[j] = i;
                map.put(i,  map.get(i) - 1);
                j++;
            }
        }
    }
}
