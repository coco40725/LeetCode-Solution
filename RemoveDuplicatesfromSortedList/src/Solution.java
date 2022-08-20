/**
 * @author Yu-Jing
 * @create 2022-08-16-PM 02:33
 */
public class Solution {
    // Recursion version
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;

        if (head.val ==  head.next.val){
           head = deleteDuplicates(head.next);
        }else {
            head.next = deleteDuplicates(head.next);
        }

        return head;

    }

}


class ListNode {
  int val;
 ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
