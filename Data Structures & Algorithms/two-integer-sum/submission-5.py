class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #need to log the complement

        map = {}
        
        #key : complement index
        for x in range(len(nums)):
            if nums[x] in map:
                if x < map[nums[x]]:
                    return [x,map[nums[x]]]
                else:
                    return [map[nums[x]], x]
            else:
                to_target = target - nums[x]
                map[to_target] = x
        


