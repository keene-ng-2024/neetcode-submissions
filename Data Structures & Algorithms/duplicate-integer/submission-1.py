class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        #use a dictionary for this
        db = {}
        for i in nums:
            if(i not in db):
                db[i] = 1
            
            else:
                return True
            
        return False

        