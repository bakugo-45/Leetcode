class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int currfloor=0;
        int time=0;
        for(int floor:requests){
            time+=Math.abs(currfloor-floor);
            currfloor=floor;
        }
        return time;
    }
}
/*
The elevator starts at floor 0 and handles each request in order. For every request, calculate the distance between the current floor and the requested floor using Math.abs(). Add this distance to the total time and update the current floor.
*/