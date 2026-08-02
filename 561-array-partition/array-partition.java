class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }
}
// First sort the array so that adjacent numbers form the best possible pairs.
// In every pair, the first element is the smaller one.
// Adding all the smaller elements gives the maximum possible answer.