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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null || head.next.next==null) return head;

        ListNode first = head;
        ListNode second = head.next;
        ListNode f=first;;
        ListNode s=second;
        while(f!=null && s!=null){
            
            f.next=s.next;
            f=f.next;
            if(f!=null)       s.next = f.next;

            s=s.next;
        }
        while(first.next!=null)
        {
            first = first.next;
        }
        first.next= second;

        return head;

    }
}