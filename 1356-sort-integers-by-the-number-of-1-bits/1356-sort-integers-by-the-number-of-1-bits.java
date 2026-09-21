class Solution {
    public int[] sortByBits(int[] arr) {
        int[]res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            int n=arr[i];
            while(n!=0){
                n=n&(n-1);
                count++;
            }
            res[i]=count;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(res[i]>res[j] || (res[i]==res[j] && arr[i]>arr[j])){
                    int temp1=res[i];
                    res[i]=res[j];
                    res[j]=temp1;
                    int temp2=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp2;
                }
            }
        }
        return arr;
    }
}
/*
Approach:
Store the bit counts in a separate array.
Count the number of set bits for every element using `n & (n - 1)`.
Sort based on the number of set bits.
If bit counts are equal, sort by the actual value.
Swap both arrays together to keep each number matched with its bit count.
Time: O(n²), Space: O(n).
*/