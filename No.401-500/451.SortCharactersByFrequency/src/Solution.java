import com.sun.source.tree.Tree;

import java.util.*;

/**
 * @author Yu-Jing
 * @create 2022-08-05-PM 04:05
 */
public class Solution {
    public static void main(String[] args) {
        String S = "tree";
        String ss = new Solution().frequencySort(S);
        System.out.println(ss);
    }
    public String frequencySort(String s) {
      // 1. calculate frequency O(N)
        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();
        for(Character c : charArray){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

     // 2. Sort by TreeSet + comparator O(1) : https://stackoverflow.com/questions/14379515/computational-complexity-of-treeset-methods-in-java
        Comparator<Map .Entry<Character,Integer>> comparator = new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
               // compare the value first (decreasingly sort), then compare the character
                if (o1.getValue().compareTo(o2.getValue()) == 0 ){
                    return -o1.getKey().compareTo(o2.getKey());
                }else {
                    return -o1.getValue().compareTo(o2.getValue());
                }
            }
        };

        TreeSet<Map.Entry<Character,Integer>> treeSet = new TreeSet<>(comparator);
        treeSet.addAll(map.entrySet());

     // 3. Output String O(n)
        String ans = "";
        for (Map.Entry<Character,Integer> entry : treeSet){
            String tmp = entry.getKey().toString();
            tmp = tmp.repeat(entry.getValue());
            ans = ans + tmp;
        }

        return ans;

    }
}
