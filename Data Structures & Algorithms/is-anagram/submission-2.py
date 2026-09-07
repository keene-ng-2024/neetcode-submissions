class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #anagram if contain same characters, with teach character
        #i could just sort both
        #complexity: 10^4 nlog(n) to n2

        #first idea, lets just sort both and do comparison
        s_sorted = "".join(sorted(s))
        t_sorted = "".join(sorted(t))

        if(s_sorted == t_sorted):
            return True
        
        else:
            return False