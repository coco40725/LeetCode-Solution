/**
 * @author Yu-Jing
 * @create 2022-08-16-PM 03:10
 */
public class Solution1 {
    // Iteration version
    public ListNode deleteDuplicates(ListNode head) {
        ListNode now = head;
        if (head == null || head.next == null) return head;
        ListNode latter = now.next;

        while(latter.next != null){
            if (now.val == latter.val){
                now.next = latter.next;
                latter = now.next;
            }else{
                now = now.next;
                latter = latter.next;
            }

        }

        if (now.val == latter.val){
            now.next = null;
        }else{
            now.next = latter;
        }

        return head;
    }
}
