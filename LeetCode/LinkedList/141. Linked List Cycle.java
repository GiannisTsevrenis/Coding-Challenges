/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode normal = head;
        ListNode fast = head;
        while (fast != null && fast.next!= null) {
            normal = normal.next;
            fast = fast.next.next;
            if (fast == normal) {
                return true;
            }
        }
        return false;
    }
}
