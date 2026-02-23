
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
//Example 2:
//
//
//Input: head = [1,2], pos = 0
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.


package Linked_list;
public class linked_list_cycle {
    public static boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;           // cycle detected
            }
        }

        return false;                  // no cycle
    }
    public static void main(String[] args) {

        // Creating nodes
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // Linking nodes
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Creating cycle (tail → node2)
        node4.next = node2;

        System.out.println(hasCycle(head)); // true
    }
}

