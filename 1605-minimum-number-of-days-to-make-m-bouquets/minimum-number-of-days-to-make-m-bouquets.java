class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k >bloomDay.length)return -1;
        int l=Integer.MAX_VALUE;
        int h=Integer.MIN_VALUE;
        for(int el:bloomDay){
            l=Math.min(l,el);
            h=Math.max(h,el);
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isPossible(bloomDay,m,k,mid)){
                h=mid-1;
            }
            else l=mid+1;
        }
        return l;
    }
    public boolean isPossible(int []bloomDay, int m, int k , int day){
        int flower=0;
        int bouquet=0;
        for(int bloom:bloomDay){
            if(bloom<=day){
                flower++;
                if(flower==k){
                    bouquet++;
                    flower=0;
                }
            }
            else flower=0;
        }
        return bouquet>=m;
    }
}
// I use Binary Search on the answer because if it is possible to make all the required
// bouquets on a certain day, then it will also be possible on every day after that since
// more flowers will have bloomed. For each middle day, I check whether enough adjacent
// flowers are available to form the required number of bouquets. If the condition is
// satisfied, I store the current day as a potential answer and continue searching on the
// left side to find an even smaller valid day. Otherwise, I search on the right side
// because additional days are needed for more flowers to bloom.