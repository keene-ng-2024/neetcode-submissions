class Solution:
    def isPalindrome(self, s: str) -> bool:
        king = []
        for ch in s:
            if ch.isalpha():
                king.append(ch.lower())
            elif ch.isnumeric():
                king.append(ch)
        
        gink = king.copy()
        king.reverse()
        
        return king == gink