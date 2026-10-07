
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        int score=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(score);
                score=0;
            }
            else{
                int innerScore=(score==0)?1:2*score;
                score=innerScore+st.pop();
            }
        }
        return score;
    }
}
/*
 * Push the current score when '(' appears and reset it to 0.
 * When ')' appears, assign 1 for "()" or double the inner score.
 * Add the result to the previous score stored in the stack.
 * Time: O(n), Space: O(n)
 */