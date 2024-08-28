class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int maxConsecutive = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int consecutive = 1;
                while (set.contains(currentNum + 1)) {
                    consecutive++;
                    set.remove(currentNum);
                    currentNum++;
                }
                maxConsecutive = Math.max(maxConsecutive, consecutive);
            }
        }
        return maxConsecutive;
    }
}
