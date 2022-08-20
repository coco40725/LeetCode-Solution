import java.util.*;

/**
 * @author Yu-Jing
 * @create 2022-08-08-PM 02:38
 */
public class Solution {
    public static void main(String[] args) {
        String[] words = new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"};
        List list = new ArrayList();
        list = new Solution().topKFrequent(words, 4);
        System.out.println(list.toString());
    }

    public List<String> topKFrequent(String[] words, int k) {
        // 1. calculate the frequency O(N)
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words){
            map.put(s, map.getOrDefault(s,0) + 1);
        }

        // 2. Sort by TreeSet + comparator : O(1)
        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue().compareTo(o2.getValue()) == 0  ){
                    return o1.getKey().compareTo(o2.getKey());
                }else{
                    return -o1.getValue().compareTo(o2.getValue());
                }
            }
        };
        TreeSet<Map.Entry<String, Integer>> treeSet = new TreeSet<>(comparator);
        treeSet.addAll(map.entrySet());

        // 3. output k most frequency
        List<String> list = new ArrayList<>();
        int i = 0;
        for (Map.Entry<String, Integer> entry : treeSet){
            if (i >= k) break;
            list.add(entry.getKey());
            i++;
        }
        return list;
    }
}
