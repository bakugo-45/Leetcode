class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*'){
                if(!st.isEmpty())st.pop();
            }
            else st.push(c);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}

// Use a stack to keep the characters that are not removed
// If we get '*' then remove the last character from the stack
// Otherwise, add the current character to the stack
// Finally, convert the stack into a string and return it