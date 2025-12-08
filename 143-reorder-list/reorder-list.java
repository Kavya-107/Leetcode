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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode fast=head;
        ListNode slow = head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secHead = slow.next;

        ListNode prev = null;
        ListNode cur = secHead;

        while(cur!=null){
            ListNode n= cur.next;
            cur.next = prev;
            prev = cur;
            cur = n;
        }
        ListNode second = prev;

        slow.next = null;
        ListNode first = head;
        while(second!=null){
            ListNode fn  = first.next;
            ListNode sn = second.next;
            first.next = second;
            second.next = fn;
            //fn.next=sn;
            first = fn;
            second = sn;
        }

        
    }
}