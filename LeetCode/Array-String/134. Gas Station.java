class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int res =0;
        if (IntStream.of(gas).sum() - IntStream.of(cost).sum() < 0) {
            return -1;
        }
        
        for (int i = 0; i < gas.length; i++) {
            sum+= gas[i] - cost[i];
            if (sum < 0) {
                sum =0;
                res = i+1;
            }
        }
        return res;
    }
}
