import java.util.ArrayList;
import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022-08-17-AM 09:13
 */
public class Solution {
    public static void main(String[] args) {
        String s =  "({{{{}}}))";
        System.out.println(new Solution().isValid(s));
    }
    public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        char[] cArray = s.toCharArray();

        for (char c : cArray){
            if (c == '(' || c == '[' || c == '{'){
                list.add(c);
            }else {
                int cValue = (int) c;
                if ( list.size() > 0 && Math.abs(cValue - list.get(list.size() - 1)) <= 2 ){
                    list.remove(list.size() - 1);
                }else {
                    return false;
                }
            }
        }

        if (list.size() == 0 ){
            return true;
        }else {
            return false;
        }
    }
}
