/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] result = new ListNode[k];
        if (head == null){
            return result;
        }
        int n = 1;
        for (ListNode i = head; i.next != null; i = i.next) {
            n++;
        }
        int item = n / k;
        int remaining = n % k;
        if (k > n) {
            ListNode prev = null;
            ListNode cur = head;
            for (int i = 0; i < n; i++) {
                result[i] = cur;
                prev = cur;
                cur = cur.next;
                prev.next = null;
            }
            for (int j = n; j < k; j++) {
                result[j] = null;
            }
            return result;
        }
        ListNode prev = null;
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            result[i] = cur;
            for (int j = 0; j < item + (remaining > 0 ? 1 : 0); j++) {
                prev = cur;
                cur = cur.next;
            }
            remaining--;
            prev.next = null;
        }
        return result;
    }
}
