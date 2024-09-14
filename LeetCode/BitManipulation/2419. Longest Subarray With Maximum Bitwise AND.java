class Solution {
    public int longestSubarray(int[] nums) {
        int max = 1;
        for (int num:nums){
            max = Math.max(max,num);
        }

        int longestSubArray = 0;
        int currentSubArray = 0;

        for(int num: nums){
            if (num == max){
                currentSubArray++;
                longestSubArray = Math.max(longestSubArray,currentSubArray);
            }else{
                currentSubArray = 0;
            }
        }
        return longestSubArray;
    }
}
