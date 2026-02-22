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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        int index;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            size=size+1;
        }
        if(n==size)
        {
            return head.next;
        }
        temp=head;
        index=size-n;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;

    return head;
        
    }
}