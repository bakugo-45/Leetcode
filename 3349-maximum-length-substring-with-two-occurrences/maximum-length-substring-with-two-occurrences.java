class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int left = 0;
        int len = 0;
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;
            while (freq[s.charAt(right) - 'a'] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            len = Math.max(len, right - left + 1);
        }
        return len;
    }
}
// Use sliding window and keep frequency of each character.
// Add the right character to the window.
// If any character appears more than 2 times,
// move left forward until the window becomes valid again.
// Then update the maximum window length.