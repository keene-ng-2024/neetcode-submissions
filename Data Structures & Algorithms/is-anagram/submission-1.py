class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        db1 = {}
        db2 = {}

        for char in s:
            if char not in db1:
                db1[char] = 0
            db1[char] += 1
        
        for char in t:
            if char not in db2:
                db2[char] = 0
            db2[char] += 1
        
        if len(db1) != len(db2):
            return False

        else:

            for item in db1:
                if item not in db2:
                    return False
                else:
                    if db1[item] != db2[item]:
                        return False
        
        return True

