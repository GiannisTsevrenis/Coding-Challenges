class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        for (int roll : rolls) {
            sum += roll;
        }
        int missingSum = mean * (rolls.length + n) - sum;
        if (n * 6 < missingSum || n > missingSum) {
            return new int[0];
        }
        int[] ans = new int[n];
        int number = missingSum/ n;
        int remainder = missingSum % n;
        if (remainder == 0) {
            Arrays.fill(ans,0, n, number);
        }else {
            Arrays.fill(ans, 0, n-remainder, number);
            Arrays.fill(ans, n-remainder, n, number+1);
        }
        return ans;
    }
}
