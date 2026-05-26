class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];  // Use array instead of HashMap (faster)
        int left = 0;
        int maxCount = 0;  // Track max frequency in current window
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            // Add the new character
            char current = s.charAt(right);
            count[current - 'A']++;
            
            // Update max frequency in current window
            maxCount = Math.max(maxCount, count[current - 'A']);
            
            // If window is invalid, shrink from left
            while ((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                count[leftChar - 'A']--;
                left++;
            }
            
            // Update result
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}