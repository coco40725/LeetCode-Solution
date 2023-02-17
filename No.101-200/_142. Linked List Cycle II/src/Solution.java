import java.util.HashSet;
import java.util.Set;

/**
 * @author Yu-Jing
 * @create 2023/2/8 下午 03:39
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            int oldSize = set.size();
            set.add(head);
            if (oldSize == set.size()) return head;
            head = head.next;
        }
        return null;
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