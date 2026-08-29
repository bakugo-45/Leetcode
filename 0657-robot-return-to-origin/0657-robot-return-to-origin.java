class Solution {
    public boolean judgeCircle(String moves) {
        char[]arr=moves.toCharArray();
        int i=0;
        int j=0;
        for(char ch:arr){
            if(ch=='R')i++;
            else if(ch=='L')i--;
            else if(ch=='U')j++;
            else j--;
        }
        return (i==0 && j==0);
    }
}