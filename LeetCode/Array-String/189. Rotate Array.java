class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverseArr(nums, 0, n - k - 1);
        reverseArr(nums, n - k, n - 1);
        reverseArr(nums, 0, n - 1);
    }

    private static void reverseArr(int[] nums, int st, int end) {
        while (st < end) {
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
}
