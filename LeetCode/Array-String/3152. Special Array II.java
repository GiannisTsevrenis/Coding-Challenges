class Solution {
  // we make an array marking the last encountered even/odd pair
  // ex. nums: [3, 4, 1, 2, 6, 4, 3] numbers: [0, 0, 0, 0, 1, 2, 2]
  // numbers[4] = 1 means he has different parity with the previous element
  // if any two elements have difference greater than 1 then they have dif parity
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] numbers = new int[nums.length];
        boolean[] result = new boolean[queries.length];

        int cc = 0;
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] & 1) ==  (nums[i - 1] & 1)) {
                cc++;
            }
            numbers[i] = cc;
        }
        cc = 0;
        for (int[] query : queries) {
            if (numbers[query[1]]-numbers[query[0]] <= 0){
                result[cc] = true;
            }
            cc++;
        }
        return result;
    }
}
