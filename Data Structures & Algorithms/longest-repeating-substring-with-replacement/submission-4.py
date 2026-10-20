class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        chars = [0] * 26
        left = 0
        result = 0
        max_freq = 0

        for i in range(len(s)):
            chars[ord(s[i]) - ord("A")] += 1
            max_freq = max(max_freq, chars[ord(s[i]) - ord("A")])

            window_size = i - left + 1
            while window_size - max_freq > k:
                chars[ord(s[left]) - ord("A")] -= 1
                left += 1
                window_size = i - left + 1

            result = max(window_size, result)

        return result