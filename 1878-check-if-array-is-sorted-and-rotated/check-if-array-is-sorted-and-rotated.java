class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length])count++;
            if(count>1)return false;
        }
        return true;
    }
}
/*
I traverse the array and count how many times the sorted order breaks.
For every element, I compare it with the next one. The last element is
compared with the first using circular indexing. If I find more than one
breaking point, the array cannot be sorted and rotated, so I return false.
Otherwise, the array satisfies the condition.
Time Complexity: O(n)
Space Complexity: O(1)
*/