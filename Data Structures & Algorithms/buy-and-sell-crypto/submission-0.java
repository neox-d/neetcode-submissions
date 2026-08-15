class Solution {
    public int maxProfit(int[] prices) {
        int buyingPrice = prices[0];
        int ans = 0;

        for (int i=1; i<prices.length; i++) {
            ans = Math.max(prices[i] - buyingPrice, ans);
            buyingPrice = Math.min(prices[i], buyingPrice);
        }

        return ans; 
        
    }
}
