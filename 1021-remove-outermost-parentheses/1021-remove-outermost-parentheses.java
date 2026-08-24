class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(count>0)sb.append(ch);
                count++;
            }
            else {
                count--;
                if(count>0)sb.append(ch);
            }
        }
        return sb.toString();
    }
}
/*
    count tells us the current nesting level.
    For '(':
    - If count > 0, add it.
    - Then increase count.
    For ')':
    - First decrease count.
    - If count > 0, add it.
    So the outermost '(' and ')' are skipped.
    Example:
    "(()())" -> "()()"
    Time: O(n)
    Space: O(n)
*/