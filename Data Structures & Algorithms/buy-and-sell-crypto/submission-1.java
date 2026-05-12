class Solution {
    public int maxProfit(int[] prices) {
        //choose a single day to buy and choose a different day in future to sell
        int current_lowest = prices[0];
        int highest_profit = 0;
        for(int i = 1; i < prices.length; i++){
            int temp_profit = prices[i] - current_lowest;
            if(temp_profit > highest_profit){
                highest_profit = temp_profit;
            }
            if(prices[i] < current_lowest){
                current_lowest = prices[i];
            }
        }

        return highest_profit;

        
        
    }
}
