class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profitMax = 0;
        for(int i=0;i<prices.length;i++){
            int currentProfit = 0;
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            currentProfit = prices[i] - minPrice;
            profitMax = Math.max(currentProfit,profitMax);
        }
        return profitMax;
    }
}
