import java.util.*;

/**
 * @author Yu-Jing
 * @create 2022-08-02-PM 02:36
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] test = new int[]{4,1,-1,2,-1,2,3};
        int[] ans = new Solution1().topKFrequent(test, 2 );
        System.out.println(Arrays.toString(ans));
    }
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k) return nums;


        TreeMap<Integer, Integer> map = new TreeMap<>();
        List<Integer> ans = new ArrayList<>();

        // 1. Count the frequency
        for (Integer i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // 2. Bucket Sort
        // Array = [count = 1, count = 2, count = 3, ... ]
        List[] bucket = new List[nums.length + 1];

         for (Integer i : map.keySet()){
            int count = map.get(i);
            if (bucket[count] == null){
                bucket[count] = new ArrayList();
            }
             bucket[count].add(i);
         }

        // 3. find the k most frequency from Array
         for (int i = bucket.length - 1; ans.size() < k && i > 0; i--){
             if (bucket[i] != null) {
                 ans.addAll(bucket[i]);
             }

         }

        return ans.stream().mapToInt(Integer::intValue).toArray();

    }

}
