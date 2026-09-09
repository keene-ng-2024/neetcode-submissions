class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        #set first
        new_nums = set(nums)
        #for each thing see if the stuff is inside or nah

        maximum = 0
    

        #check if a number has a before and after, that one is not the start. 

        #if a number has a before but no after, it is a possible end
        #if a number has a after but no before, it is a possibe start
        
        #compare if larger or smaller
        temp_count = 0

        if len(nums) == 0:
            return temp_count
        
        
        for num in new_nums:

            if (num+1 in new_nums and num - 1 not in new_nums):
                #we have found a start
                temp_runner = num
                temp_count  = 0

                while temp_runner in new_nums:
                    temp_count += 1
                    temp_runner += 1
                    print(str(num) + "hi")
            
                
                if temp_count > maximum:
                    print("triggered")
                    maximum = temp_count
                
                
                    
            else:
                continue
        
        
        if temp_count > maximum:
            maximum = temp_count
        
        return max(1, maximum)

                

            