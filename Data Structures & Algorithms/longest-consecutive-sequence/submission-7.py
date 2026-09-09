class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums.sort()
        
        mapping = {}

        left = 0
        maximum = 0
        deduction = 0

        
        print(nums)
        for i in range(len(nums)):
            if nums[i] not in mapping:
                mapping[nums[i]] = 1
            else:
                deduction += 1
            
            if(i != 0):
                if(nums[i] - nums[i-1] > 1):
                    temp_max = i - left - deduction
                    print(str(i))
                    if(temp_max > maximum):
                        maximum = temp_max
                    left = i
                    deduction = 0
        
        
        temp_maximum = len(nums) - deduction - left
        if temp_maximum > maximum:
            maximum = temp_maximum

        return maximum


            

            



        