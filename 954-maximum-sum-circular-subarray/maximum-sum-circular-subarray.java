class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        for(int el:nums){
            total+=el;
        }
        int normalsum=kadane(nums);
        for(int i=0;i<nums.length;i++){
            nums[i]=-nums[i];
        }
        int invertedsum=kadane(nums);
        int wrap=total+invertedsum;
        return (wrap==0)?normalsum:Math.max(normalsum,wrap);
    }
    public int kadane(int[]nums){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int el:nums){
            curr+=el;
            max=Math.max(curr,max);
            if(curr<0)curr=0;
        }
        return max;
    }
}