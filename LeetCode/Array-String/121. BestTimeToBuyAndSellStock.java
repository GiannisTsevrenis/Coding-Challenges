class Solution {
        public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPurchase = prices[0];
        int profit = 0;
        for (int i : prices) {
            profit = i - minPurchase;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (minPurchase > i) {
                minPurchase = i;
            }
        }
        return maxProfit;
    }
}
