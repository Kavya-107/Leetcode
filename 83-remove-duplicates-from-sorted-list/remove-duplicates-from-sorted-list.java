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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node=head;
        while(node!=null&&node.next!=null)
        {
            ListNode next=node.next;
            while(node.val==next.val)
            {
                if(next.next==null){
                    node.next=null;
                    return head;
                }
                next=next.next;
            }
            node.next=next;  
            node=next;
        }
        return head;        
    }
}