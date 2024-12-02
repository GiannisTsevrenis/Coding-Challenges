class Solution {
    public int maxSubArray(int[] nums) {
        int totalMaximum = nums[0];
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            current = Math.max(current, 0);
            current += nums[i];
            totalMaximum = Math.max(totalMaximum, current);
        }
        return totalMaximum;
    }
//    n^2 solution
//    public int maxSubArray(int[] nums) {
//        int currentSum;
//        int maximumSum = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            currentSum = 0;
//            for (int j = i; j < nums.length; j++) {
//                currentSum += nums[j];
//                maximumSum = Math.max(currentSum, maximumSum);
//            }
//        }
//        return maximumSum;
//    }
}
