package two_pointer;
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(new MinimumSizeSubarraySum().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(new MinimumSizeSubarraySum().minSubArrayLen(4, new int[]{1, 4, 4}));
        System.out.println(new MinimumSizeSubarraySum().minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int p1 = 0;
        int total = 0;
        int minarray = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            while (total >= target) {
                minarray = Math.min(minarray, i - p1 + 1);
                total -= nums[p1];
                p1++;
            }
        }
        return minarray == Integer.MAX_VALUE ? 0 : minarray;
    }
}
