import com.sun.source.tree.Tree;

import java.sql.Array;
import java.util.*;

/**
 * @author Yu-Jing
 * @create 2022-07-29-PM 04:30
 */
/*
* Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 * */
public class Solution {
     public static void main(String[] args) {
        int[] test = new int[]{4,1,-1,2,-1,2,3};
        int[] ans = new Solution().topKFrequent(test, 2 );
         System.out.println(Arrays.toString(ans));
    }

    public int[] topKFrequent(int[] nums, int k) {

        if (nums.length == k) return nums;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] ans = new int[k];

        // 1. Count the frequency
        for (Integer i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // 2. Sort by value. Turn Map into Set. Take Entry as element
        Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue().compareTo(o2.getValue()) == 0) return o1.getKey().compareTo(o2.getKey());
                return  -o1.getValue().compareTo(o2.getValue());
            }
        };

        TreeSet<Map.Entry<Integer, Integer>> treeSet = new TreeSet<>(comparator);
        treeSet.addAll(map.entrySet());

        int count = 0;
        for (Map.Entry entry : treeSet){
            ans[count] = (Integer) entry.getKey();
            count++;
           if (count > k - 1) break;

        }
        return ans;





    }

}


