/**
 * @author Yu-Jing
 * @create 2022-08-15-PM 03:46
 */
public class Solution1 {
    // Iteration version
    public ListNode reverseList(ListNode head) {
        ListNode list = new ListNode();

        while(head != null){
            // reverse
            ListNode tmp = head.next.next; // record the next next value
            head.next.next = head; // head.next 其下一個指針 指向前一個: head
            head.next = tmp; // head 的指針指向最後一個: tmp

            // update head
            head = head.next;
        }
        return head;
    }
}

