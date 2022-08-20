/**
 * @author Yu-Jing
 * @create 2022-08-12-AM 09:45
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("aadd"));
    }

    public int firstUniqChar(String s) {
        int[] count = new int[26];
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++){
            count[charArray[i] - 'a'] ++;
        }
        for (int i = 0; i < charArray.length; i++){
           if ( count[charArray[i] - 'a'] == 1) return i;
        }

        return -1;
    }
}
