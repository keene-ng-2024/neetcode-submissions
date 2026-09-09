class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rights = [1] * len(nums)
        lefts = [1] * len(nums)

        for i in range(len(nums)):
            if i == 0:
                continue
           # elif i == 1:
           #     lefts[i] = nums[0]
            #    rights[len(nums) - 1 - i] = nums[len(nums) - 1]
            else:
                lefts[i] = lefts[i-1] * nums[i-1]
                rights[len(nums) - 1 - i] = rights[len(nums) - i] * nums[len(nums)- i]
        
        answers = []
        for i in range(len(nums)):
            if i == 0:
                answers.append(rights[0])
            elif i == len(nums) - 1:
                answers.append(lefts[i])
            else:
                answers.append(rights[i] * lefts[i])
            


         
        return answers
            
            
        