class Solution {
    public boolean sumGame(String num) {
        int leftsum=0;
        int rightsum=0;
        int qleft=0;
        int qright=0;
        int n=num.length();
        for(int i=0;i<n/2;i++){
            int el=num.charAt(i)-'0';
            if(num.charAt(i)=='?')qleft++;
            else leftsum+=el;
        }
        for(int i=n/2;i<n;i++){
            int el=num.charAt(i)-'0';
            if(num.charAt(i)=='?')qright++;
            else rightsum+=el;
        }
        int sumdiff=leftsum-rightsum;
        return (qleft+qright)%2==1 || sumdiff!=9*((qright-qleft)/2);
    }
}