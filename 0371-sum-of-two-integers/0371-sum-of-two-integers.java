class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int sum=a^b;
            int carry=(a&b)<<1;
            a=sum;
            b=carry;
        }
        return a;        
    }
}
/*
Approach:
Use XOR to add two numbers without considering carry.
Use AND to find the carry, then shift it left by 1 position.
Repeat this process until there is no carry left.
Finally, a contains the sum.
*/
