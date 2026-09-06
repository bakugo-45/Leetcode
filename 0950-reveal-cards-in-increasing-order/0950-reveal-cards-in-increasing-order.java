class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[]ans=new int[deck.length];
        Queue<Integer>q=new ArrayDeque<>();
        for(int i=0;i<deck.length;i++){
            q.offer(i);
        }
        for(int el:deck){
            int i=q.poll();
            ans[i]=el;
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
        }
        return ans;
    }
}
/*
    First sort the cards because we want them to be revealed
    from smallest to largest.
    Instead of putting the cards directly into a queue,
    I keep the indexes of the answer array in a queue.
    
    The queue simulates the actual reveal process:
    - take the front position
    - place the current smallest card there
    - remove that position
    - move the next position to the back

    This tells us exactly where each sorted card should be placed.
    Finally, the answer array represents the deck arrangement
    that will reveal cards in increasing order.
*/