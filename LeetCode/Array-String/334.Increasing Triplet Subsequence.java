class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length == 0 || nums.length<3){
            return false;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > second) {
                return true;
            }
            if (num <= first) {
                first = num;
            } else {
                second = num;
            }
        }
        return false;
    }
}
