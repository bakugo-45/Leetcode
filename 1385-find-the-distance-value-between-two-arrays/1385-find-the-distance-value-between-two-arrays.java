class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int i=0;i<arr1.length;i++){
            boolean valid=true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    valid=false;
                    break;
                }
            }
            if(valid)count++;
        }
        return count;
    }
}
// Traverse each element of arr1 and compare it with every element of arr2.
// Assume the element is valid initially.
// If absolute difference <= d, mark it invalid and break.
// If all elements satisfy the condition, increment the count.
// Finally, return the total count.