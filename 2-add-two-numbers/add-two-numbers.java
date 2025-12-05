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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int c=0;
       ListNode res =null;
       ListNode cur = res;
       while(l1!=null || l2!=null || c!=0)
       {
        int sum = c;
        if(l1!=null) sum+=l1.val;
        if(l2!=null) sum+=l2.val;

        ListNode t=new ListNode(sum%10);
        c=sum/10;
        if(res==null)
        {
            res=t;
            cur=res;
        }
        else{
        cur.next = t;
        cur=t;
        }

        if(l1!=null) l1=l1.next;
        if(l2!=null) l2=l2.next;
       }

        return res;
    }
}