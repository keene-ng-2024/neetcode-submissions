class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        db = {}
        left = 0
        maxlength = 0

        for i in range(len(s)):
            char = s[i]
            if char not in db:
                db[char] = 0
            db[char] += 1

            while db[char] > 1:
                #size down
                curr_char = s[left]
                db[curr_char] -= 1
                left += 1
            
            maxlength = max(maxlength, i - left +1)

        return maxlength