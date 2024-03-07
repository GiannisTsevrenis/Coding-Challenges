import static java.lang.Math.max;

class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        int maxReach = 0;
        while (i < nums.length && i <= maxReach) {
            maxReach = max(i + nums[i], maxReach);
            i++;
        }
        return i == nums.length;
    }
}
