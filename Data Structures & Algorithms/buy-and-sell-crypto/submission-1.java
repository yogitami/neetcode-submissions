class Solution {
    public int maxProfit(int[] prices) {
        int maxProfitGained = 0;
        int buy = prices[0];
    
        for(int i = 1; i < prices.length ; i++){
            int currentProfit = prices[i] - buy;
            maxProfitGained = Math.max(maxProfitGained,currentProfit);
            if(prices[i] < buy){
                buy = prices[i];
            }
        }

        return maxProfitGained;
    }
}
