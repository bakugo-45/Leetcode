/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first=-1;//index of first critical point
        int last=-1;//index of last critical point
        int i=1;
        int min=Integer.MAX_VALUE;
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr.next!=null){
            ListNode next=curr.next;
            boolean isCritical=(curr.val>prev.val && curr.val>next.val)||
            (curr.val<prev.val &&  curr.val<next.val);
            if(isCritical){
                if(first==-1)first=i;
                else min=Math.min(min,i-last);
                last=i;
            }
            prev=curr;
            curr=next;
            i++;
        }
        if(first==-1 || last==first) return new int[]{-1,-1};
        else return new int[]{min,last-first};
    }
}
/*
I traverse the linked list and check whether each middle node is a local maximum or minimum.
When I find the first critical point,I store its index in first.
For every next critical point,I calculate its distance from 
the previous critical point using i - last
and update the minimum distance. Then last is updated to the current critical point.
At the end, last - first gives the maximum distance between critical points.
If there are fewer than two critical points,I return [-1, -1].
*/