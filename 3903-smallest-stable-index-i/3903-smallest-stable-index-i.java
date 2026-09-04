class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int []suffixMin=new int[nums.length];
       int n=nums.length;
       suffixMin[n-1]=nums[n-1];
       for(int i=n-2;i>=0;i--){
            suffixMin[i]=Math.min(nums[i],suffixMin[i+1]);
       }
       int prefixMax=Integer.MIN_VALUE; 
       for(int i=0;i<nums.length;i++){
            prefixMax=Math.max(prefixMax,nums[i]);
            if(Math.abs(prefixMax-suffixMin[i])<=k)return i;
       }
       return -1;
    }
}
/*
   I use suffixMin to store the minimum value from each index
   to the end of the array.
   Then I keep prefixMax while moving from left to right.
   For each index, the score is:
   maximum from start to i - minimum from i to end.
   If the score is <= k, that index is stable.
   Since I check from left to right, the first stable index
   is automatically the smallest one.
   Time: O(n)
   Space: O(n)
*/


// class Solution {
//     public int firstStableIndex(int[] nums, int k) {
//        for(int i=0;i<nums.length;i++){
//             if(score(nums,i)<=k){
//                 return i;
//             }
//        }
//        return -1; 
//     }
//     public int score(int []nums,int i){
//         int max=Integer.MIN_VALUE;
//         int min=Integer.MAX_VALUE;
//         for(int j=0;j<=i;j++){
//             max=Math.max(max,nums[j]);
//         }
//         for(int j=i;j<nums.length;j++){
//             min=Math.min(min,nums[j]);
//         }
//         return max-min;
//     }
// }
/*
   Check each index from left to right.
   Find max from 0 to i and min from i to end.
   If max - min <= k, return i.
   First valid index is the smallest one.
   Time: O(n^2)
   Space: O(1)
*/