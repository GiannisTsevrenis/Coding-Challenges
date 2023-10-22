class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m - 1, y = n - 1, z = n + m - 1;
        while (y >= 0) {
            if (x >= 0 && (nums1[x] >= nums2[y])) {
                nums1[z] = nums1[x];
                x--;
            } else {
                nums1[z] = nums2[y];
                y--;
            }
            z--;
        }
    }
}
