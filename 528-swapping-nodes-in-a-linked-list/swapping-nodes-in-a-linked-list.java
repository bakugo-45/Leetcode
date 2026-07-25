
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        ListNode kfromstart=first;
        ListNode second=head;
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        ListNode kfromend=second;
        int temp=kfromstart.val;
        kfromstart.val=kfromend.val;
        kfromend.val=temp;
        return head;

    }
}
/*
Approach:
- First, move a pointer to the kth node from the beginning and keep its reference.
- Then, start another pointer from the head and move both pointers together.
- When the first pointer reaches the last node, the second pointer will automatically be at the kth node from the end.
- Finally, swap the values of these two nodes and return the head.
Time Complexity: O(n)
Space Complexity: O(1)
*/