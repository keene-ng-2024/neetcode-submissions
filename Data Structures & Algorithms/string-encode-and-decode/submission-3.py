class Solution:

    def encode(self, strs: List[str]) -> str:
        #so we only need to make sure, that you have the correct number
        #each string has a number + a delimeter
        parts = []
        for s in strs:
            parts.append(str(len(s)) + "#" + s)
        return "".join(parts)


    def decode(self, s: str) -> List[str]:
        words = []
        i = 0
        while i < len(s):
            j = i
            while s[j] != "#":
                j += 1
            length = int(s[i:j])
            words.append(s[j + 1 : j + 1 + length])
            i = j + 1 + length
        return words
        
            




                



