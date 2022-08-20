import java.util.Arrays;

/**
 * @author Yu-Jing
 * @create 2022-08-12-AM 10:05
 */
// 同字母異序詞
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        if (s.length() != t.length()) return  false;

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        for (int i = 0; i < sCharArray.length ; i++){
            sCount[sCharArray[i] - 'a']++;
            tCount[tCharArray[i] - 'a']++;
        }
        return Arrays.equals(sCount,tCount);
    }
}
