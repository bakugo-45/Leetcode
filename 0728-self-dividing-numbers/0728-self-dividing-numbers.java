class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(div(i))ans.add(i);
        }
        return ans;
    }
    public boolean div(int num){
        int n=num;
        while(n!=0){
            int r=n%10;
            if(r==0)return false;
            else if(num%r!=0)return false;
            n/=10;
        }
        return true;
    }
}