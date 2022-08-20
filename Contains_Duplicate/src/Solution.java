import java.util.*;

/**
 * @author Yu-Jing
 * @create 2022-08-02-PM 04:12
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // compare the size between List and Set
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            list.add(i);
            set.add(i);
        }
        if (set.size() == list.size()){
            return false;
        }else{
            return true;
        }


    }
}
