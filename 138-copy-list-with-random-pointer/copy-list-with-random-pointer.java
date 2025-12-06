/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null ) return null;
        Node cur = head;
        while(cur!=null)
        {
            Node t = new Node(cur.val);
            t.next=cur.next;
            cur.next = t;
            cur=t.next;
            System.out.println(t.val+" ");
        }
        cur=head;
        while(cur!=null)
        {
            if(cur.next!=null && cur.random!=null) 
                cur.next.random = cur.random.next;
            cur=cur.next.next;
        }

        Node newh=head.next;
        cur=head;
        Node cpcur=newh;
        while(cur!=null)
        {
            if(cur.next!=null)
            cur.next=cur.next.next;
            cur=cur.next;
            if(cpcur.next!=null)
            cpcur.next=cpcur.next.next;
            cpcur=cpcur.next;


        }
        


        return newh;        
    }
}