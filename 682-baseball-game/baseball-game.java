class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s: operations){
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(st.peek()*2);
            }
            else if(s.equals("+")){
                int l=st.pop();
                int se=st.peek();
                st.push(l);
                st.push(l+se);
            }
            else {
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        for(int el:st){
            sum+=el;
        }
        return sum;
    }
}

// We use a stack to store the valid scores.
// If the operation is a number, we push it into the stack.
// If it is "C", we remove the last score using pop().
// If it is "D", we push double of the last score.
// If it is "+", we add the last two scores and push their sum.
// At the end, we add all the scores in the stack and return the total.
// This works because the stack always keeps the previous valid scores.
