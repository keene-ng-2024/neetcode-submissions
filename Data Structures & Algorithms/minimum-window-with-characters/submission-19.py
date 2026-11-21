class Solution:
    def minWindow(self, s: str, t: str) -> str:
        db = {}
        for ch in t:
            if ch not in db:
                db[ch] = 0
            db[ch] += 1
        
        left = 0
        remainder = len(t)
        shortest = ""

        #we go through the main thing
        for i in range(len(s)):
            if s[i] in db:
                db[s[i]] -= 1

                if db[s[i]] >= 0:
                    remainder -= 1
            
            #once i hit my valid thing then i know at least i have an answer and i can possibly shrink

            while remainder == 0:
                #we need to see if it is the new shortest first
                if len(shortest) == 0:
                    shortest = s[left:i+1]
                else:
                    if len(shortest) > i - left + 1:
                        shortest = s[left:i + 1]
                
                #so now we handle the moving
                ch = s[left]
                if ch in db:
                    db[ch] += 1

                    #we add to remainder if the new value is above 0
                    if db[ch] > 0:
                        remainder += 1

                left += 1


        return shortest
            

            
        

        return shortest