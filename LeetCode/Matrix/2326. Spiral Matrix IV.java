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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int xEnd = m - 1;
        int xStart = 0;
        int yEnd = n - 1;
        int yStart = 0;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(matrix[i], -1);
        }
        ListNode cur = head;
        while (xStart <= xEnd && yStart <= yEnd) {
            //left -> right
            for (int i = yStart; i <= yEnd; i++) {
                if (cur != null) {
                    matrix[xStart][i] = cur.val;
                    cur = cur.next;
                }
            }
            xStart++;
            // top -> bottom
            for (int i = xStart; i <= xEnd; i++) {
                if (cur != null) {
                    matrix[i][yEnd] = cur.val;
                    cur = cur.next;
                }
            }
            yEnd--;
            // right -> left
            if (xStart <= xEnd) {
                for (int i = yEnd; i >= yStart; i--) {
                    if (cur != null) {
                        matrix[xEnd][i] = cur.val;
                        cur = cur.next;
                    }
                }
                xEnd--;
            }
            // bottom -> top
            if (yStart <= yEnd) {
                for (int i = xEnd; i >= xStart; i--) {
                    if (cur != null) {
                        matrix[i][yStart] = cur.val;
                        cur = cur.next;
                    }
                }
                yStart++;
            }
        }
        return matrix;
    }
}
