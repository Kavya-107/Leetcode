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
        ListNode temp = head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }

        if(len == n)
        {
            return head.next;
        }
        temp = head;
        int bal = len - n;
        for(int i=1;i<bal;i++)
        {
            temp = temp.next;
        }
        if(temp.next!=null) 
        temp.next = temp.next.next;

        return head;

    }
}