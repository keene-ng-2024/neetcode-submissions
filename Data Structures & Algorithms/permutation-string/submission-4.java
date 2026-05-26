class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] need = new int[26];
        int[] have = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            need[s1.charAt(i) - 'a']++;
            have[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (need[i] == have[i]) matches++;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            if (matches == 26) return true;

            int inChar  = s2.charAt(i) - 'a';
            int outChar = s2.charAt(i - s1.length()) - 'a';

            // add incoming char
            have[inChar]++;
            if (have[inChar] == need[inChar])      matches++;
            else if (have[inChar] == need[inChar] + 1) matches--;

            // remove outgoing char
            have[outChar]--;
            if (have[outChar] == need[outChar])      matches++;
            else if (have[outChar] == need[outChar] - 1) matches--;
        }

        return matches == 26;
    }
}