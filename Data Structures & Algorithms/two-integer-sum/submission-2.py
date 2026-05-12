class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        count = len(nums)

        for i in range(count):
            counter2 = i+1
            for number in nums[i+1:]:
                if nums[i] + number == target:
                    return [i, counter2]
                counter2 += 1
        

                