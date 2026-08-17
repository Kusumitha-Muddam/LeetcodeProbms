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
        if (head == null || head.next == null) {
    return head;
}
        ListNode p=head;
        ListNode q=head.next;
        ListNode l=new ListNode();
        ListNode k=l;
        while(  p!=null)
        {
            k.next= new ListNode(p.val);
            if(p.next!=null)
            p=p.next.next;
            else
            p=null;
            k=k.next;
        }
        while( q!=null ){
            k.next=new ListNode(q.val);
            if(q.next!=null)
            q=q.next.next;
            else
            q=null;
           k=k.next;
        }
        return l.next;
    }
}