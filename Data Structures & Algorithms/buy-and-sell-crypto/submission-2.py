class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        #hold a lowest and compare with profit
        lowest = prices[0]
        profit = 0
        for i in range(len(prices)):
            profit = max(profit,prices[i]- lowest)
            if prices[i] < lowest:
                lowest = prices[i]
        
        return profit


            
            
            