class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        for(int i=0;i<nums.length-2;i++){
            int sum=0;
            int left=i+1;
            int right=n-1;
            while(left<right){
                sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-res))res=sum;
                if(sum==target)return target;
                else if(sum>target)right--;
                else left++;
            }
        }
        return res;
    }
}