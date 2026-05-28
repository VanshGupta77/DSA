class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0 ; i<prices.length; i++){
            if(buyPrice < prices[i]){  // PROFIT
                    int profit = prices[i] - buyPrice; //Today's Profit
                    maxProfit= Math.max(maxProfit , profit);
                    
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}