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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null){
            return false;
        }
        return isPossiblePath(head,root) || isSubPath(head,root.right) || isSubPath(head,root.left);
    }
    private boolean isPossiblePath(ListNode head, TreeNode root) {
        if ( head == null){
            return true;
        }
        if ( root == null || head.val!=root.val){
            return false;
        }
        return isPossiblePath(head.next,root.left) || isPossiblePath(head.next,root.right);
    }
}
