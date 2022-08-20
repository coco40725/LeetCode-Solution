import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

/**
 * @author Yu-Jing
 * @create 2022-08-12-AM 09:26
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("aabbbbbd"));
    }
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        char[] cArray = s.toCharArray();
        for (Character c : cArray){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (int i = 0; i < cArray.length ; i++){
            if (map.get(cArray[i]) == 1) return i;
        }
        return -1;
    }
}
