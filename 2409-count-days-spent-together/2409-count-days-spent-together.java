class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aArrive=getDay(arriveAlice);
        int bArrive=getDay(arriveBob);
        int aLeave=getDay(leaveAlice);
        int bLeave=getDay(leaveBob);
        int start=Math.max(aArrive,bArrive);
        int end=Math.min(aLeave,bLeave);
        if(start>end)return 0;
        return end-start+1; 
    }
    int getDay(String date){
        int []days={31,28,31,30,31,30,31,31,30,31,30,31};
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3));
        for(int i=0;i<month-1;i++){
            day+=days[i];
        }
        return day;
    }

}
/*
1. Convert all four dates into day numbers using getDay().
2. Extract the month and day from each date string.
3. Add the days of previous months to get the day number of the year.
4. Find the later arrival day using Math.max().
5. Find the earlier leaving day using Math.min().
6. If start > end, return 0 because there is no overlap.
7. Otherwise, return end - start + 1 to count the common days, including both dates.
*/