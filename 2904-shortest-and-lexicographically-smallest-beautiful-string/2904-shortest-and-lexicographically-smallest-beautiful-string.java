class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int count=0;
        StringBuilder ans= new StringBuilder();
        int len=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)=='1'){
                count++;
            }
            while(count>k ){
                if(s.charAt(left)=='1')count--;
                left++;
            }
            while(count==k && s.charAt(left)=='0'){
                left++;
            }
            if(count==k){
                int currlen=right-left+1;
                if(currlen<len){
                    len =currlen;
                    ans=new StringBuilder(s.substring(left,right+1));
                }
                else if(currlen==len){
                    String curr=s.substring(left,right+1);
                    if(curr.compareTo(ans.toString())<0){
                        ans=new StringBuilder(curr);
                    }
                }
            }
        }
        return ans.toString();
    }
}
// We use sliding window to find a substring with exactly k ones.
// right -> expands the window and counts 1s
// left  -> moves forward when we have more than k ones
// When count == k, we remove extra 0s from the left
// so that the current window becomes as short as possible.
// If current window is shorter, make it our answer.
// If same length, compare both strings and keep
// the lexicographically smaller one.
// At the end, return the shortest beautiful substring.