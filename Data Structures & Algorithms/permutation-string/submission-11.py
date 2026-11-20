class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        db = {}
        left = 0
        remainder = len(s1)

        for ch in s1:
            if ch not in db:
                db[ch] = 0
            db[ch] += 1
        
        for i in range(len(s2)):
            if s2[i] in db:
                db[s2[i]] -= 1
                if db[s2[i]] >= 0:
                    remainder -= 1

            if i - left + 1 > len(s1):
                #we need to size down the window
                if s2[left] in db:
                    db[s2[left]] += 1
                    if db[s2[left]] > 0:
                        remainder += 1
                
                left += 1


            if remainder == 0:
                return True
        
        return False


        

        