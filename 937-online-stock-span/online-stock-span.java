class StockSpanner {
    Stack<Integer> st;
    ArrayList<Integer> prices;
    public StockSpanner() {
        st = new Stack<>();
        prices = new ArrayList<>();
    }
    public int next(int price) {
        prices.add(price);
        int i = prices.size() - 1;
        while (!st.isEmpty() && prices.get(st.peek()) <= price) {
            st.pop();
        }
        int span;
        if (st.isEmpty()) {
            span = i + 1;
        } else {
            span = i - st.peek();
        }
        st.push(i);
        return span;
    }
}
/**
I used a monotonic decreasing stack to store the indices of previous greater prices. I keep the prices in an ArrayList and remove all previous prices smaller than or equal to the current price. If the stack is empty, the span is `i + 1`; otherwise, it is `i - st.peek()`. This gives an O(n) amortized solution.
*/



