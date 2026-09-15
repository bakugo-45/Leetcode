class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max=new ArrayDeque<>();
        Deque<Integer> min=new ArrayDeque<>();
        int left=0;
        int ans=0;
        for(int right=0;right<nums.length;right++){
            while(!max.isEmpty() && nums[max.peekLast()]<nums[right]){
                max.pollLast();
            }
            max.offerLast(right);
            while(!min.isEmpty() && nums[min.peekLast()]>nums[right]){
                min.pollLast();
            }
            min.offerLast(right);
            while(nums[max.peekFirst()]-nums[min.peekFirst()] > limit){
                if(max.peekFirst()==left)max.pollFirst();
                if(min.peekFirst()==left)min.pollFirst();
                left++;
            }
            ans=Math.max(right-left+1,ans);
        }
        return ans;
    }
}
// I need to find the longest subarray where the difference
// between the maximum and minimum is at most the limit.
// I use two deques to keep track of the maximum and minimum
// efficiently. The max deque keeps values in decreasing order,
// while the min deque keeps values in increasing order, so their
// front always gives the current maximum and minimum. I expand
// the window using right, and if max - min becomes greater than
// the limit, I move left forward until the window becomes valid
// again. Finally, I keep updating the maximum length found.