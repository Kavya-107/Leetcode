/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        int lena=0;
        int lenb=0;

        while(a!=null)
        {
            a=a.next;
            lena++;
        } 

        while(b!=null)
        {
            b=b.next;
            lenb++;
        }
        a=headA;
        b=headB;

        if(lena>lenb){
            while(lena>lenb)
            {
                a=a.next;
                lena--;   
            }
        }  

        if(lenb>lena)
        {
            while(lenb>lena){
                b=b.next;
                lenb--;
            }
        }

        while(a!=b)
        {
            a=a.next;
            b=b.next;
        } 

        return a;                      
    }
}