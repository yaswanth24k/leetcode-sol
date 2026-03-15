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
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        if(temp==null||temp.next==null)
        {
            return head;
        }
        List<Integer> values=new ArrayList<>();
        while(temp!=null)
        {
            values.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(values);
        temp=head;
        for(int value : values)
        {
            temp.val=value;
            temp=temp.next;
        }

        return head;
    }
}