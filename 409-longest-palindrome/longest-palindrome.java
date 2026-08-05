class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }
        int ans = 0;
        for (int f : freq) {
            if (f % 2 == 0) {
                ans += f;          // Take all even occurrences
            } else {
                ans += f - 1;      // Take the even part
            }
        }
        // If there is any odd frequency, place one character in the center
        if (ans < s.length()) {
            ans++;
        }
        return ans;
    }
}
// First, count the frequency of each character. Then, add all even frequencies completely and only the even part of odd frequencies (frequency - 1) to the answer. Finally, if any character has an odd frequency, add one more character to the center of the palindrome and return the maximum possible length.