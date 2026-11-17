class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        #only one distinct character
        #we want to do it in O(n) so that means that we need to maintain some state as we go along

        #on new element it is an add, and everytime we shrink, it is a deletion from this window

        #probably something is maintaining a state of how much allowance i have left

        #that means my store is probably the [0]*26

        #X -> 1 , Y
        #we are maintaining a left index, right, so when it dont match our left index, we start minusing
        #from k right, and then everytime we update the length between the two pointers? that the max

        #if it dont match, and the state is = 0, then we start shrinking the window, reach a new guy
        #and actually the size of my window minus how much of that guy, tells me my new k allowance at that point right

        db = [0]*26
        left = 0
        longest = 0
        #ord
        for i in range(len(s)):
            index = ord(s[i]) - ord("A")
            db[index] += 1

            greatest = 0
            for pos,count in enumerate(db):
                if count > db[greatest]:
                    greatest = pos

            while (i - left + 1) - db[greatest] > k:
                db[ord(s[left]) - ord("A")] -= 1
                left += 1

                greatest = 0
                for pos,count in enumerate(db):
                    if count > db[greatest]:
                        greatest = pos
            
            longest = max(longest, (i - left + 1))


            #no need for allowance, just keep calculating window length - left index count > k we need shrink, then we 
            #check for the max at the end

        
        
        return longest
            





        
        