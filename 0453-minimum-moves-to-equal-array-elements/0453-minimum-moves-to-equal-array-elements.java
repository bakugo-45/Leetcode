class Solution {
    public int minMoves(int[] nums) {
        int res=0;
        int min=Integer.MAX_VALUE;
        for(int el:nums){
            min=Math.min(min,el);
        }
        for(int i=0;i<nums.length;i++){
            res+=nums[i]-min;
        }
        return res;
    }
}
// Increasing n-1 elements is equivalent to decreasing 1 element.
// So, instead of increasing elements, imagine decreasing elements.
// Make every element equal to the smallest element in the array.
// Total moves = sum of (each element - minimum element).