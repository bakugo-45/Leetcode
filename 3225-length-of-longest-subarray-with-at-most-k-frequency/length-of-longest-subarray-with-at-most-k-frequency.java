class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
    int left = 0;
    int ans = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int right = 0; right < nums.length; right++) {
        // add right
        map.put(nums[right],map.getOrDefault(nums[right], 0) + 1);
        // make window valid
        while (map.get(nums[right]) > k) {
            map.put(nums[left],map.get(nums[left]) - 1);
            left++;
        }
        // valid window
        ans = Math.max(ans, right - left + 1);
    }
    return ans;
    }
}
// We use a sliding window and HashMap to store the frequency of each number.
// Expand the window by moving right and adding nums[right] to the map.
// If the frequency of the current number becomes greater than k,
// shrink the window from the left until the frequency becomes valid again.
// At every step, the window is valid, so we update the maximum length.