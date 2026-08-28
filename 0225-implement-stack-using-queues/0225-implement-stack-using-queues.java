class MyStack {
    Queue<Integer> ans;
    public MyStack() {
        ans=new ArrayDeque<>();
    }
    
    public void push(int x) {
       ans.offer(x);
       int n=ans.size();
       for(int i=0;i<n-1;i++){ //here n-1 cause we are rotating element before added element
        ans.offer(ans.poll());
       }

    }
    
    public int pop() {
        return ans.poll();
    }
    
    public int top() {
        return ans.peek();
    }
    
    public boolean empty() {
        return ans.isEmpty();
    }
}
/*
Use a queue like a stack by moving all old elements behind the newly added element, so the newest element always comes to the front.
*/


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */