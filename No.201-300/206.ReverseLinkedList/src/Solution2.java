/**
 * @author Yu-Jing
 * @create 2023/2/9 上午 11:17
 */
public class Solution2 {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        ListNode listNode = new Solution().reverseList(l);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);
        System.out.println(listNode.next.next.next.val);
    }
    public ListNode reverseList(ListNode head) {
        while (head != null && head.next != null){
            // define three pointer
            ListNode prevNode = head;
            ListNode curNode = head.next;
            ListNode nextNode = null;
            if (head.next.next != null){
                nextNode = head.next.next;
            }

            // change direction: cur -> prev
            curNode.next = prevNode;
            // change direction: next -> cur
            if (nextNode != null) nextNode.next = curNode;

            // update head
            if (nextNode != null){
                head = nextNode;
            } else {
                return head;
            }
        }
        return head;
    }
}
