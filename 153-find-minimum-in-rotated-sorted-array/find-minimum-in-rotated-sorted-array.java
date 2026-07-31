class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right])left=mid+1;
            else right=mid;
        }
        return nums[left];
    }
}
// If mid element is greater than the rightmost element,
// it means the minimum lies in the right half,
// so move left to mid + 1.
// Otherwise, the minimum is at mid or in the left half,
// so keep mid by moving right = mid.