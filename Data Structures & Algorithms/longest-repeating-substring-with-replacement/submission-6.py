class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        #we need to see the max frequency for each element
        #and this is updated according to the new right that comes in

        #so basically we update first, if something exceeds the current leader, then that new one shall change

        left = 0
        result = 0
        chars = [0] * 26
        max_freq = 0

        for i in range(len(s)):
            chars[ord(s[i]) - ord("A")] += 1
            #we just see if after the new one was added in, it becomes anything different
            max_freq = max(max_freq, chars[ord(s[i]) - ord("A")])

            while (i- left) + 1 - max_freq > k:
                chars[ord(s[left]) - ord("A")] -= 1
                left += 1

            result = max((i-left) +1, result)


        return result 
        