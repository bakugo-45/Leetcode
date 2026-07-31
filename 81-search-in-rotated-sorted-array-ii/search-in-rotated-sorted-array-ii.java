class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target)return true;
            if(nums[left]==nums[mid] && nums[mid]==nums[right]){
                left++;
                right--;
                continue;
            }
            //if left side is sorted
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && nums[mid]>target)right=mid-1;
                else left=mid+1;
            }
            //else right side is sorted
            if(nums[mid]<=nums[right]){
                if(nums[mid]<=target && target<=nums[right]) left=mid+1;
                else right=mid-1;
            }
        }
        return false;
    }
}
// I used a modified binary search for this problem.
// First, I check if the middle element is the target.
// If duplicates make it impossible to identify the sorted half
// (nums[low] == nums[mid] == nums[high]), I simply shrink both ends.
// Otherwise, I find the sorted half and check whether the target lies there.
// This solution works in O(log n) on average, but in the worst case with many
// duplicates it can take O(n).