import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Yu-Jing
 * @create 2022-08-10-PM 03:19
 */
public class Solution {
    public static void main(String[] args) {
        int[] n1 = new int[]{4,9,5};
        int[] n2 = new int[]{9,4,9,8,4};
        int[] ans = new Solution().intersect(n1,n2);
        System.out.println(Arrays.toString(ans));

    }
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        if (nums1 == null || nums2 == null) return new int[]{};


        for (Integer value1 : nums1){
            map.put(value1, map.getOrDefault(value1,0) + 1);
        }



        for (Integer value2 : nums2){
            if (map.get(value2) != null && map.get(value2) != 0)  {
                list.add(value2);
                map.put(value2, map.get(value2) - 1);
            }
        }

        if (list.size() != 0){
            int[] ans = new int[list.size()];
            for(int i = 0; i < list.size(); i++){
                ans[i] = list.get(i);
            }
            return ans;
        }else {
            return new int[]{};
        }
    }

}
