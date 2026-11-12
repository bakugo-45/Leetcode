class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int inc=1;
        int dec=1;
        for(int i=1;i<nums.length;i++){
            int maxincdec=0;
            if(nums[i]<nums[i-1]){
                dec++;
                inc=1;
            }
            else if(nums[i]>nums[i-1]){
                inc++;
                dec=1;
            }
            else{
                inc=1;
                dec=1;
            }
            maxincdec=Math.max(inc,dec);
            max=Math.max(max,maxincdec);
        }
        return max;
    }
}
// Track increasing and decreasing subarray lengths.
// Reset the opposite counter whenever the direction changes.
// If elements are equal, reset both counters to 1.
// Update the maximum length at every step.