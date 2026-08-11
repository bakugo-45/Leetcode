class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1)break;
            sum+=nums[i];
        }
        while(contains(nums,sum)){
            sum++;
        }
        return sum;
    }
    boolean contains(int []nums, int x){
        for(int n:nums){
            if(n==x)return true;
        }
        return false;
    }
    }
// First find the longest consecutive prefix and calculate its sum.
// Then check from that sum whether the number is present in the array.
// If it is present, keep increasing until we find a missing number.
// That missing number is the answer.