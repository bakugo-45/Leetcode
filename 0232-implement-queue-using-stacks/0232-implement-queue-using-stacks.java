class MyQueue {
    Stack<Integer> st;
    public MyQueue() {
        st=new Stack<>();
    }
    
    public void push(int x) {
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int prev=st.pop();
        push(x);
        st.push(prev);
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}
/*
I used one stack and tried to keep the first inserted element on top so that `pop()` follows FIFO order. For every new element, all existing elements need to be moved temporarily, then the new element is pushed, and the old elements are placed back. My current code only moves one element, so it works for two elements but fails when there are three or more.

*/



/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */