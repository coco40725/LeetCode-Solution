/**
 * @author Yu-Jing
 * @create 2022-08-12-PM 01:20
 */
public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        // 1->3->5 LinkedList created
        ListNode head2 = new ListNode(0);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(4);

        // 0->2->4 LinkedList created
        ListNode mergedhead = mergeTwoLists(head1, head2);

        printList(mergedhead);
      }
    // Iteration version
    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode(-1); // stay at the origin
        ListNode p = list; // use p to add node


        while(list1 != null && list2 != null){
            if (list1.val <= list2.val){
                p.next = list1;
                list1 = list1.next; // update pointer
            }else {
                p.next = list2;
                list2 = list2.next;  // update pointer
            }
            p = p.next;  // update pointer
        }

        if (list1 == null){
            p.next = list2;
        }else {
            p.next = list1;
        }

        return list.next;

    }
    // A utility function to print linked list
    static void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

}


 class ListNode {
     int val;
     ListNode next;

     ListNode() {
     }

     ListNode(int val) {
         this.val = val;
     }

     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
 }
