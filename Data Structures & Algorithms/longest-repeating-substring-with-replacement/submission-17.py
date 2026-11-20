class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        #okay our input is only limited to the 26 chars so thats the size of our state

        db = [0] * 26

        left = 0

        greatest = 0

        longest = 0

        #we want to do it in o(N) so whenever we see a new char,  we check if its now the largest? in our window
        #also our window can only maximum exceed by one, and need one change if we check every round

        #every time we do that how we check? basically we take the window size - greatest currently, and 
        #see if it exceeds k


        for i in range(len(s)):
            index = ord(s[i]) - ord("A")
            db[index] += 1

            #because even if we shrink dat, and put a new one in it is still gonna be the greatest if it is
            greatest = max(greatest, db[index])



            #now we need to check if the size exceeds
            if i - left + 1 - greatest > k:
                index_to_remove = ord(s[left]) - ord("A")
                db[index_to_remove] -= 1
                left += 1
            
            longest = max(longest, i - left + 1)


        return longest

