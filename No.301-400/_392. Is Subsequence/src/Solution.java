/**
 * @author Yu-Jing
 * @create 2023/2/8 下午 03:16
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int index = 0;

        for (char c : tc){
            if (c == sc[index]){
                if (index ==  s.length() - 1){
                    return true;
                } else {
                    index ++;
                }
            }
        }
        return false;
    }
}
