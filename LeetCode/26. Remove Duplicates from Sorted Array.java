class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int prev = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != prev){
                nums[count] = nums[i];
                prev = nums[i];
                count++;
            }
        }
        return count;
    }
}
