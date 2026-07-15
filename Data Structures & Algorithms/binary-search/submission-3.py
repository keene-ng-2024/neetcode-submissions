class Solution:
    def search(self, nums: List[int], target: int) -> int:
        #sorted in ascending order, with a target integer, I want to find the index of the target
        #since it is sorted i will search via binary search

        left = 0
        right = len(nums) - 1

        while left <= right:
            middle = left + (right - left) // 2
            if target == nums[middle]:
                return middle
            elif target > nums[middle]:
                left = middle + 1
            else:
                right = middle -1
        
        return -1
        