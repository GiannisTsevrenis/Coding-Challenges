class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        int totalLength = rolls.length + n;
        for (int roll : rolls) {
            sum += roll;
        }
        if ((n * 6) < (mean * totalLength - sum)) {
            return new int[0];
        }
        if (n > (mean * totalLength - sum)) {
            return new int[0];
        }
        int[] ans = new int[n];
        int checkInt = (mean * totalLength - sum) / n;
        double checkDouble = (double) (mean * totalLength - sum) / n;
        if (checkInt == checkDouble) {
            Arrays.fill(ans,0, n, checkInt);
        }else {
            long integerPart = (long) checkDouble;
            double floatingPointPart = checkDouble - integerPart;
            int high = (int) Math.round(floatingPointPart * n);
            Arrays.fill(ans, 0, n-high, checkInt);
            Arrays.fill(ans, n-high, n, checkInt+1);
        }
        return ans;
    }

}
