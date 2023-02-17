import java.util.HashMap;
import java.util.Set;

/**
 * @author Yu-Jing
 * @create 2023/2/8 下午 04:09
 */
public class Solution {
    public int longestPalindrome(String s) {
        int palLength = 0;
        //  find the count is  over than 2
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character key : map.keySet()){
            palLength = palLength + (map.get(key) / 2) * 2;
        }
        if (palLength < s.length()) palLength++;
        return palLength;
    }
}
