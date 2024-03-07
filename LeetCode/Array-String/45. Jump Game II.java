import static java.lang.Math.max;
class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int jumps = 0;
        int maxReach = nums[0];
        int steps = nums[0];
        for (int i = 1; i < nums.length-1; i++) {
            maxReach = max(maxReach,nums[i]+i);
            steps --;
            if (steps == 0){
                jumps++;
                steps = maxReach -i;
            }
        }
        return jumps+1;        
    }
}
