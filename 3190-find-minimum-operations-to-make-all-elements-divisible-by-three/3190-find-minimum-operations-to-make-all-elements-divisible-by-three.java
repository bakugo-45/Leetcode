class Solution {
    public int minimumOperations(int[] nums) {
        int res=0;
        for(int el:nums){
            if(el%3!=0)res++;
        }
        return res;
    }
}
// Count numbers not divisible by 3.
// Each such number needs exactly 1 operation (+1 or -1).
// Numbers already divisible by 3 need 0 operations.
