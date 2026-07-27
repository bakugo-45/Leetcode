class Solution {
    public int maxProduct(int[] nums) {
        int currproduct=1;
        int maxproduct=Integer.MIN_VALUE;
        //from left to right
        for(int el:nums){
            currproduct*=el;
            maxproduct=Math.max(currproduct,maxproduct);
            if(currproduct==0)currproduct=1;
        }
        currproduct=1;
        //from right to left
        for(int i=nums.length-1;i>=0;i--){
            currproduct*=nums[i];
            maxproduct=Math.max(currproduct,maxproduct);
            if(currproduct==0)currproduct=1;
        }
        return maxproduct;
    }
}