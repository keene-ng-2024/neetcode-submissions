class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        db = {}
        for num in nums:
            if num not in db:
                db[num] = 0
            else:
                return True
        return False
        