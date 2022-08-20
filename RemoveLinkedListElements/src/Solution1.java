/**
 * @author Yu-Jing
 * @create 2022-08-15-PM 02:02
 */
public class Solution1 {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(6);
        ListNode ll = new Solution1().removeElements(l,6);
    }
    // Iteration version
    public ListNode removeElements(ListNode head, int val) {
        ListNode list = new ListNode();
        ListNode pointer = list;

        while(head != null){
            if (head.val != val) {
                pointer.next = head;
                head = head.next;
                pointer = pointer.next;
            }else {
                head = head.next;
            }
        }
        pointer.next = null;
        return list.next;
    }
}
