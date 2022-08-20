import java.util.*;

/**
 * @author Yu-Jing
 * @create 2022-08-09-AM 11:22
 */
public class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] index = new boolean[2000];
        List<Integer> list = new ArrayList<>();

        for (int i : nums1){
            index[i] = true;
        }

        for (int i : nums2){
            if (index[i] == true){
                list.add(i);
                index[i] = false;
            }
        }

        if (list.size() != 0){
            int[] ans = new int[list.size()];
            for (int i = 0 ; i < list.size() ; i++){
                ans[i] = list.get(i);
            }
            return ans;
        }else {
            return new int[]{};
        }

    }

}
