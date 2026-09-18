class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int el:nums){
            xor=xor^el;
        }
        int diff_digit=xor&-xor;
        int b1=0,b2=0;
        for(int el:nums){
            if((el & diff_digit)==0)b1=b1^el;
            else b2=b2^el;
        }
        return new int[]{b1,b2};
    }
}
/*
First, XOR all the elements. Since duplicate numbers cancel each other, the result contains the XOR of the two unique numbers.
Find the rightmost set bit using `xor & -xor`. This bit is different between the two unique numbers.
Use this bit to divide all numbers into two groups.
XOR the numbers in each group separately. Duplicate numbers cancel out, leaving the two unique numbers.
Finally, return the two numbers.
Time Complexity: **O(n)**
Space Complexity: **O(1)**
*/