class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        Queue<Integer>rad=new ArrayDeque();
        Queue<Integer>dir=new ArrayDeque();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R')rad.offer(i);
            else dir.offer(i);
        }
        while(!rad.isEmpty() && !dir.isEmpty()){
            int r=rad.poll();
            int d=dir.poll();
            if(r>d)dir.offer(n+d);
            else rad.offer(n+r);
        }
        return rad.isEmpty()?"Dire":"Radiant";
    }
}
// Store R and D positions in two queues.
// The senator with the smaller position acts first and bans the other.
// Move the winning senator to the next round using index + n.
// Continue until one party's queue becomes empty.
