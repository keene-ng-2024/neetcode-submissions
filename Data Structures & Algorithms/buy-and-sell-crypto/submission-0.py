class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxprof = 0
        if len(prices) <= 1:
            return maxprof
        
        #base settings
        minbuy = prices[0]
        maxsell = max(prices[1:])
        maxprof = max(maxprof, maxsell-minbuy)

        index = 0
        for price in prices:
            if price < minbuy:
                minbuy = price
                maxprof = max(maxprof, max(prices[index:]) - minbuy)
            index += 1
        
        return maxprof
            
            
            