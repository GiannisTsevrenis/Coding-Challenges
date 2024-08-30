class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            int end = i;
            if (start == end) {
                list.add(String.valueOf(nums[i]));
            } else {
                list.add(nums[start] + "->" + nums[end]);
            }
        }
        return list;
    }
}
