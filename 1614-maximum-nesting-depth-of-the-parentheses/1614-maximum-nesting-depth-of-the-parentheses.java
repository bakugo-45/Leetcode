class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
                max=Math.max(max,count);
            }
            else if(ch==')'){
                count--;
            }
        }
        return max;
    }
}
// Keep track of the current parenthesis depth using count
// '(' increases the depth, while ')' decreases it
// Update max whenever we reach a new maximum depth
// The maximum depth found is the answer

/*
Stack<Character> stack = new Stack<>();
int max = 0;
for(char ch : s.toCharArray()) {
    if(ch == '(') {
        stack.push(ch);
        max = Math.max(max, stack.size());
    }
    else if(ch == ')') {
        stack.pop();
    }
}
return max;
 */