import java.util.ArrayList;

/**
 * @author Yu-Jing
 * @create 2023/2/8 上午 09:49
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1 would be the main listNode
        int sum;
        if (l2 == null) {
            sum =  l1.val + 0;
        } else{
            sum =  l1.val + l2.val;
        }

        // if over 10, carry number to next node
        if (sum >= 10) {
            int tenNum = (sum / 10);
            if (l1.next != null) {
                l1.next.val += tenNum;
            }
            sum -= (tenNum * 10);
        }
        l1.val = sum;

        if (l1.next != null && l2.next != null){
            l1.next = addTwoNumbers(l1.next, l2.next);

        } else if (l1.next == null && l2.next != null){
            l1.next = addTwoNumbers(l2.next, null);

        } else if (l1.next != null && l2.next == null ){
            l1.next = addTwoNumbers(l1.next, l2);
        } else {
            return l1;
        }
        return l1;
    }
}

