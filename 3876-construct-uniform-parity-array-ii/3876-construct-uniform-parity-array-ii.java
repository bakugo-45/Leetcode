class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd=Integer.MAX_VALUE;
        for(int el:nums1){
            if(el%2==1){
                minOdd=Math.min(minOdd,el);
            }
        }
        if(minOdd==Integer.MAX_VALUE)return true;
        for(int el:nums1){
            if(el%2==0 && el<=minOdd){
                return false;
            }
        }
        return true;
    }
}
// Find the smallest odd number.
// We can keep odd numbers as they are.
// For an even number, subtracting a smaller odd number makes it odd.
// So if minOdd < x for every even x, we can make all numbers odd.