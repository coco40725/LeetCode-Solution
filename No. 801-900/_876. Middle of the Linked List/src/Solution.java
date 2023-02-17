import java.util.ArrayList;

/**
 * @author Yu-Jing
 * @create 2023/2/8 下午 03:27
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        int middleIndex;
        while (head != null){
            list.add(head);
            head = head.next;
        }

        middleIndex = list.size() / 2;
        return list.get(middleIndex);
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}