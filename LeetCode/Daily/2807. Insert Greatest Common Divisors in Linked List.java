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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null){
            return head;
        }
        ListNode cur = head.next;
        ListNode prev = head;
        int gcd;
        while(cur!=null){
            gcd = gcd(prev.val, cur.val);
            prev.next = new ListNode(gcd,cur);
            prev = cur;
            cur = cur.next;
            

        }
        return head;
    }
    int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}
