class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #anagram if contain same characters, with teach character
        #i could just sort both
        #complexity: 10^4 nlog(n) to n2

        #new idea lets do counts
        #think about it in a dictionary we can just delete in o(1) too!

        if len(s) != len(t):
            return False

        map = {}

        for char in s:
            if char not in map:
                map[char] = 0
            map[char] += 1

        for char in t:
            if char not in map:
                return False
            else:
                map[char] -= 1

                if map[char] == 0:
                    del map[char]
        
        return len(map) == 0
