import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022-08-12-AM 10:12
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // think about a question: two person walk with two different speeds in a cycled path, do they meet in the end? Yes!
        ListNode node1 = head;
        ListNode node2 = head;

        while(node1 != null && node2 != null && node2.next != null ){
          node1 = node1.next;
          node2 = node2.next.next;
          if (node1 ==  node2) return true;
        }
        return false;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
          val = x;
          next = null;
  }
}
