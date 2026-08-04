class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int small=Integer.MAX_VALUE;
        int big=Integer.MIN_VALUE;
        int []freq=new int[101];
        for(int el:nums){
            freq[el]++;
            small=Math.min(small,el);
            big=Math.max(big,el);
        }
        for(int i=small;i<=big;i++){
            if(freq[i]!=1)ans.add(i);
        }
        return ans;
    }
}