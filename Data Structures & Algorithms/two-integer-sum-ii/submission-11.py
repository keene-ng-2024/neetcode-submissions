class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0
        right = len(numbers) - 1  

        while(left < right):
            nig = numbers[left] + numbers[right]
            if nig > target:
                right -= 1
            elif nig < target:
                left += 1
            else:
                return [left + 1, right + 1]
