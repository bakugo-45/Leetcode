class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            int rev_val=26-(c-'a');
            int ind_val=i+1;
            sum+=rev_val*ind_val;
        }
        return sum;
    }
}
// Reverse value of a character = 26 - its normal alphabet value
// Multiply each character's reverse value by its 1-based index
// Add all values to get the final reverse degree