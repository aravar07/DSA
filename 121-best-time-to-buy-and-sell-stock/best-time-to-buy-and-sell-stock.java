class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int minPrice=prices[0];
        int max_profit=0;

        for(int i=0;i<n;i++){
            minPrice = Math.min(minPrice, prices[i]);
            max_profit = Math.max(max_profit, prices[i]-minPrice);
        }
        return max_profit;
    }
}