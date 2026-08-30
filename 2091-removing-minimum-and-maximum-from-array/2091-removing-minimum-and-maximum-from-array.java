class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1)return 1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int el:nums){
            max=Math.max(el,max);
            min=Math.min(el,min);
        }
        int minIndex=-1;
        int maxIndex=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==min)minIndex=i;
            if(nums[i]==max)maxIndex=i;
        }
        int front=Math.max(minIndex,maxIndex)+1;
        int back= n- Math.min(minIndex,maxIndex);
        int both=Math.min(minIndex,maxIndex)+1 + n- Math.max(minIndex,maxIndex);
        return Math.min(front, Math.min(both,back));
    }
}
/*
First, I find the minimum and maximum elements and their indexes. Then I check the three possible ways to remove them: both from the front, both from the back, or one from the front and the other from the back. For the last case, I check both possible combinations and take the smaller one. Finally, I return the minimum among all cases.
*/