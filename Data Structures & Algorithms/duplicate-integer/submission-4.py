class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        #if any value appears more than once
        #complexity: since nums.length 10^5, around O(n) to O(nlogn)

        map = {}

        for num in nums:
            if num not in map:
                map[num] = 1
            else:
                return True
        
        return False
        