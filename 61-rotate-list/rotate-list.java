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
    public ListNode rotateRight(ListNode head, int k) {
        int len=0;
        if(k==0 || head==null || head.next==null) return head;
        ListNode temp = head;
        while(temp!=null){
             temp=temp.next;
             len++;
        }
        
        k=k%len; 
        if(k==0){
            return head;
        }
       
        int bal = len-k;
        ListNode t =null;
        temp=head;
        while(bal-->0){
            t=temp;
            temp=temp.next;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = head;
        head = t.next;
        t.next=null;
        return head;
    }
}