/**
 * @author Yu-Jing
 * @create 2022-08-12-AM 09:57
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().canConstruct("bb","aba"));
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magIndex = new int[26];
        char[] magCharArray = magazine.toCharArray();
        char[] ranCharArray = ransomNote.toCharArray();

        for (int i = 0; i < magCharArray.length ; i++){
            magIndex[magCharArray[i] - 'a']++;
        }
        for (int i = 0; i < ranCharArray.length ; i++){
            if ( magIndex[ranCharArray[i] - 'a'] == 0) return false;
            magIndex[ranCharArray[i] - 'a']--;
        }
        return true;

    }
}
