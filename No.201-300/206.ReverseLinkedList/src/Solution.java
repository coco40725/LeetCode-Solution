/**
 * @author Yu-Jing
 * @create 2022-08-15-PM 02:22
 */
public class Solution {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        new Solution().reverseList(l);

    }

    // Recursion version
    public ListNode reverseList(ListNode head) {
        if (head == null ) return head;
        if (head.next == null) return head;
        ListNode tmp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return tmp;
    }
}

 class ListNode {
    int val;
     ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }