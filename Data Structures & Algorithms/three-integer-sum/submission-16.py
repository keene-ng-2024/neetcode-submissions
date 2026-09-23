class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        #reduce the problem size to 2 sum by holding the first element first
        nums.sort()
        answers = []

        for left in range(0, len(nums) -1):
            if left > 0 and nums[left] == nums[left - 1]:
                continue
            #create the 2 pointers
            middle = left + 1
            right = len(nums) - 1

            #create the target value to hit
            target = 0 - nums[left]

            while(middle < right):
                #check the case where its a valid option first
                result = nums[middle] + nums[right]

                if result == target:
                    #before we append we need to figure out if it had been appended before, since we already factor in doubel counting left
                    #we need to factor in a duplicate middle or right so infact right if the middle before it has been called before it is
                    #an auto fail, so lets check that, but since middle techincally could be pointing to the left in the first iteration, then 
                    #we need to look at the right instead, since it will always hit, cause if the right value is the same
                    #i think we can just look at the most recent addditon
                    if len(answers) > 0:
                        if answers[len(answers) -1][1] == nums[middle] and answers[len(answers) - 1][2] == nums[right]:
                            middle += 1 
                            right -= 1
                            continue
                    
                    answers.append([nums[left], nums[middle], nums[right]])
                    middle += 1
                    right -= 1
                        
                    
                elif result < target:
                    middle += 1
                else:
                    right -= 1

        
        return answers
        